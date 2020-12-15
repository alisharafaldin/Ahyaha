package db;

import company.Tools;
import company.Tools.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class go {
        
    private static String url = "";
    private static String  dbName = "company"; // أو يمكن كتابته مباشرة بعد3306
    private static Connection con; // الإنبورت الخاص به هو import java.sql.Connection;
    
    private static void setURL(){
        url = "jdbc:mysql://localhost:3306/" + dbName // للوصول لقاعدة البيانات
              + "?useUnicode=true&characterEncoding=UTF-8"; // للتعامل مع اللغة العربية
    }
    
    private static void setConnection (){
        
        try {
            setURL();
            con = DriverManager.getConnection(url,"root", "");
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    }
    
    public static boolean checkUserAndPass(String username, String password){ // دالة التحقق من إسم المستخدم وكلمة المرور
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strCheck ="select * from users where "
                    + "username ='" + username + "' and "
                    + "pass = '" + password + "'";
            
            stmt.executeQuery(strCheck);
            while (stmt.getResultSet().next()){
                con.close();
                return true;
            }
           con.close();
        } catch(SQLException ex){
        Tools.msgBox(ex.getMessage());
        }
            return false;
    }
    
    public static boolean runNonQuery(String sqlStatement){ // دالة الإضافة والحزف والتعديل فقط
        try{
            setConnection();
            Statement stmt = con.createStatement(); // جملة استعلام جديدة
            stmt.execute(sqlStatement); // تنفيز أمر
            con.close(); //إقفال الإتصال
            return true;
            
        }catch(SQLException ex){
            Tools.msgBox(ex.getMessage());
            return false;
        }
    }
    
    public static String getAutoNumber(String tableName, String columnName){ // لمعرفة الرقم الأتوماتيكي
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strAuto = "SELECT MAX(" + columnName + ")+1 as autonum"
                           + " FROM " + tableName;
            stmt.executeQuery(strAuto); // تنفيز أمر
            String num = " ";
            while(stmt.getResultSet().next()){ // توقيف الجملة على أول بيان موجود
                num = stmt.getResultSet().getString("autonum");
            }
            con.close();
            if(num == null || "".equals(num)){
                return "1";
            }
            else{
                return num;
            }
        }
        catch(SQLException ex){
        Tools.msgBox(ex.getMessage());
        return "0";
        }
    } 
    
    public static Table getTableData(String statemet){ // إستقبال جدول كمصوصفة بدخله البياناات بناء ع الإستعلام المرسل
        Tools t = new Tools();
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(statemet);
            
            ResultSetMetaData rsmd = rs.getMetaData(); // للتعامل مع العامود داخل الإستعلام
            int c = rsmd.getColumnCount(); // عدد الأعمدة الآتية من الإستعلام
            
            Table table = t.new Table(c);
            
            while(rs.next()){
                Object row[] = new Object[c];
                for(int i = 0 ; i < c ; i++){ // للتعامل مع الأعمدة
                    row[i] = rs.getString(i + 1);
                }
                table.addNewRow(row);
            }
            con.close();
            return table;
        }   
        catch(SQLException ex){
            Tools.msgBox(ex.getMessage());
            return t.new Table(0);
        }
    }
    
    public static void fillcombo(String tableName, String columnName, JComboBox combo) throws SQLException{ // دالة تعبة الكومبو بكس
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            String strSelect = "SELECT " + columnName + " FROM " + tableName;
            rs = stmt.executeQuery(strSelect);
            rs.last(); // إيقاف المرشر على آخر صف
            int c = rs.getRow(); // تخزين عدد الصفوف
            rs.beforeFirst(); // إرجاعه للوضع الأول
            
            String values[] = new String[c];
            int i = 0;
            while(rs.next()){
                values[i] = rs.getString(1);
                i++;
            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values));
        }
        catch(SQLException ex){
            Tools.msgBox(ex.getMessage());
        }
    }
    
    public static void fillToJTable(String tableNameOrSelectStatement, JTable table){ // دالة تعبئة جدول عن طريق جملة الإستعلام المرسلة
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            String SPart = tableNameOrSelectStatement.substring(0, 7).toLowerCase(); // لقطع  سبع خانات 
            String strSelect;
            if("select " .equals(SPart)){ // استدعاء اول سبع خانات ومقارنتها  // يحدث خطأ إزا كان بالكبتل
                strSelect = tableNameOrSelectStatement;
            }
            else{
                strSelect = "SELECT * FROM " + tableNameOrSelectStatement;
            }
            rs = stmt.executeQuery(strSelect); // تنفيز جملة الإستعلام
            
            ResultSetMetaData rsmd = rs.getMetaData(); // للتعامل مع الأعمدة
            int c = rsmd.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)table.getModel(); // للتعامل مع الجدول
            
            Vector row = new Vector();  // هزا المتغير يشبه الجدول وهو لوضع بيانات الجدول فيه
            model.setRowCount(0);
            
            while(rs.next()){
                row = new Vector(c);
                for(int i = 1 ; i <= c ; i++){
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if(table.getColumnCount() != c){
                Tools.msgBox("JTable Columns Count Not Equal To Query Columns Count\nJTable Columns Count Is: "
                            + table.getColumnCount() 
                            + "\nQuery Columns Count Is: " + c );
            }
            con.close();
        }
        catch(SQLException ex){
            Tools.msgBox(ex.getMessage());
        }
    }
} 
