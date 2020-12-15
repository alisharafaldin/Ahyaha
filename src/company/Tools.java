

package company;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Tools{
    
    //public static String msgBox;
    
    public static void msgBox(String massage){
        JOptionPane.showMessageDialog(null, massage);
    } // إخراد رسالة
    
    public static boolean confirmMsg(String message){
       int msgC = JOptionPane.showConfirmDialog(null, message);
       if(msgC == JOptionPane.YES_OPTION){
           return true;
       }
       else{
           return false;
       }
    }
    
    public static void CreateFolder (String folderName, String path){
    File f = new File(path + "/" + folderName);
    f.mkdir();
    } // إنشاء فولدر في موقع محدد
    
    public static void CreateFolder (String folderName){
    File f = new File(folderName);
    f.mkdir();
    } // إنشاء فوادر في ملف النظام
   
    public static void openForm(JFrame form){
      try {
        form.setLocationRelativeTo(null);
        Image img = ImageIO.read(Tools.class.getResource("شخصية شرفنتود مفرغة.png"));
        form.setIconImage(img);
        form.setDefaultCloseOperation(2);
        form.getContentPane().setBackground(Color.white);// لون خلفية الفورم
        form.setVisible(true);
      } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    } // تهيئة النموزج
    
    public static void clearText(Container form){ // حزف كل النصوصفي الأدوات
        for(Component c : form.getComponents()){
           if(c instanceof JTextField){
            JTextField text = (JTextField)c;
            text.setText("");
           }  
             else if(c instanceof Container){
             clearText((Container)c);
           }
        }
    }
    
    public static void createEmptyFile(String fileName){ // إنشاء ملف فارغ
     
        try {
            File f = new File(fileName + ".txt");
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void createEmptyFils(String fileNames[]){ // إنشاء عدة ملفات فارغة
        for(String str : fileNames){
          createEmptyFile(str);
        }
    }
    
    public static void creatCustomFile (String fileName, Object data[]){ // تعبئة فايل بالبيانات
        try {
            PrintWriter p = new PrintWriter(fileName + ".txt");
            for(Object obj : data){
               p.println(obj);
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void creatCustomFiles(String FileNames[] , Object allData[][]){ // إنشاءعدة  ملفات بالبيانات
    
        for(int x = 0 ; x < FileNames.length ; x++){
            creatCustomFile(FileNames[x], allData[x]);
        }
    }
    
    public static Object InputBox(String title){ // 
        Object obj = JOptionPane.showInputDialog(title);
        return obj;
    }
    
    public static String getNumberToString(String text){ // إستخراج الأرقام من نصوص
        String val = "";
        for(char c : text.toCharArray()){
           if(c == '0' | c == '1' | c == '2' | c == '3' | c == '4' | c == '5' | c == '6' | c == '7' |c == '8' | c == '9' ){
             val += c;
           }
        }
        return val;
    }
    
     public static int getNumberToInteger(String text){ // إستخراج الأرقام في شكل رقمي
        String val = "";
        for(char c : text.toString().toCharArray()){
           if(c == '0' | c == '1' | c == '2' | c == '3' | c == '4' | c == '5' | c == '6' | c == '7' |c == '8' | c == '9' ){
             val += c;
           }
        }
        return Integer.parseInt(val);
    }
     
    public static String removeNumberToString(String text){// دالة ح>ف الأرقام من النصوص
        String val = "";
        for(char c : text.toCharArray()){
           if(!(c == '0' | c == '1' | c == '2' | c == '3' | c == '4' | c == '5' | c == '6' | c == '7' |c == '8' | c == '9' )){
             val += c;
           }
        }
        return val;
    }
    
    public static void printScreen(String Imagename){ //تصوير الشاشة مع  نافزة البرنامج
    
        try {
            Robot r = new Robot(); //استدعاء البرنت اسكرين / تصوير الشاشة
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); //تحديد أبعاد الشاشة
            BufferedImage img = r.createScreenCapture(rec); // تسجيل الصورة بداخلها
            ImageIO.write(img, "jpg", new File(Imagename + ".jpg"));
                    } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void printScreen(String Imagename , JFrame form){ // تصوير الشاشة من غير ناف>ة البرنامج
    
        try {
            form.setState(1); //إهفاء نافزة البرنامج
            Robot r = new Robot(); //استدعاء البرنت اسكرين / تصوير الشاشة
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); //تحديد أبعاد الشاشة
            BufferedImage img = r.createScreenCapture(rec); // تسجيل الصورة بداخلها
            ImageIO.write(img, "jpg", new File(Imagename + ".jpg"));
            form.setState(0); //إظهار نافزة البرنامج
                    } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
    public static class StringTools{

        String text;
        private String inverseText;
        String texts[];
        String textArray;

        public StringTools ( String text){
          this.text = text;
        }
        public StringTools(String texts[]){
          this.texts = texts;

        }
        public void PrintCharByChar(){ // طباعة حرف حرف
          for(char c : text.toCharArray()){
             System.out.println(c);

          }
        }  
        public void PrintCharByCharInverse(){ //بالعكس طباعة حرف حرف
            StringBuilder sb = new StringBuilder(text);
            inverseText = sb.reverse().toString();
                for (char c: inverseText.toCharArray()){
                   System.out.println(c);
                }
           }
        public void printStringArray(){
             for(String s : texts){
              System.out.println(s);
             }
           }
           ///// دالة ترجع مصفوفة 
        public String getStringArrayElement(){
               textArray = "";
               for(String s : texts){
                  textArray += s + " ; ";
               }
               return textArray;
           }
    }


                    public class Table{

                    public int columns;
                    public Object[][] Items;

                    public Table (int columns){ // إنشاء جدول بإرسال الأعمدة والصفوف
                     this.columns = columns;
                     Items = new Object[0][columns];
                    }

                    public void addNewRow(Object row[]){
                        //الإحتفاظ بالعناصر القديمة داخل متغير مؤقت
                        Object TempItems[][] = Items;
                        //زيادة المتغير الأساسي بعنصر إضافي
                        Items = new Object[Items.length + 1][columns];
                        //تعبئة العناصر القديمة في العنصر الأساسي
                        for(int x = 0 ; x < TempItems.length ; x++){
                             Items[x] = TempItems[x];     
                        }
                        // إضافة الصف الجديد للعنصر الأساسي
                        Items[Items.length - 1] = row;
                    }

                    public void printItime(){
                     for(Object objs[] : Items){
                         for(Object obj : objs){
                             System.out.print(obj + " ; ");
                         }
                         System.out.println();
                     }
                    }

                    public void editRow(int rowIndex, int columnIndex, Object newData){
                        Items [rowIndex][columnIndex] = newData;
                    }

                    public void deleteRow(int rowIndex){
                        Object TempItems[][] = Items;
                        Items = new Object[Items.length - 1][columns];
                        int y = 0; 
                        for(int x = 0 ; x < TempItems.length ; x++){
                           if(x != rowIndex){
                             Items[y] = TempItems[x];
                             y++;
                           }
                        }
                    }

                    public Object getValue(int rowIndex, int columnIndex){
                    return Items[rowIndex][columnIndex];
                    }

                    public Object getRow(int rowIndex){
                     return Items [rowIndex];
                    }
                    /// جدول الضرب
                  /*  public int multiNum (){
                        int r = columns;
                        for(int x = 1 ; x <= 1 ; x++){
                          System.out.println( columns + " * " + x + " = " + x * columns);
                        }
                    return r;
                    }*/
                }
        public static class MergeArray{

        public Object[] array1;
        public Object[] array2;

        public MergeArray(Object[] array1 , Object[] array2){ // دمج المصفوفات
            this.array1 = array1;
            this.array2 = array2;
        }

        public Object[] mergeTowArrays(){
            int a1 = array1.length;
            int a2 = array2.length;
            Object[] arrayR = new Object[a1 + a2];
            //دالة نسخ المصفوفة في مصفوفة ثانية
            System.arraycopy(array1, 0 , arrayR, 0, a1); 
            System.arraycopy(array2, 0, arrayR, a1, a2);

            return arrayR;
        }
    }
        
    public static void setReport(JTable table){
        table.getTableHeader().setBackground(new Color(0,0,100));
        table.getTableHeader().setForeground(Color.white);        
    } 
    
    public static void printReport(JTable table, String title){
    
     try {
            
            //tblDept.print();
             
            MessageFormat header = new MessageFormat( title + " Report");
            MessageFormat footer = new MessageFormat("Page - {0}");
            
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (Exception ex) {
            Tools.msgBox(ex.getMessage());
        }
    }
}