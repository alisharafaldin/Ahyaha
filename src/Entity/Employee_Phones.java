package Entity;

import company.Tools;
import javax.swing.JTable;

public class Employee_Phones implements mainData{
    
    private int empNo;
    private String phone;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void add() {
        String strInsert = "INSERT INTO employee_phones VALUES("
                + empNo + ","
                + "'" + phone + "')";
     boolean isAdd = db.go.runNonQuery(strInsert);
     if(isAdd){
        // Tools.msgBox("Phone Is Add");
     }
    }  

    @Override
    public void update() {
            Tools.msgBox("Update Method In Employee_phones Class Not Working! \n دالة التحديث داخل كلاس أرقام الموظفين لا تعمل!");
    }

    @Override
    public void delete() {
       String strDelete = "DELETE FROM employee_phones "
                + " WHERE "
                + " empNo=" + empNo
                + " AND phone ='" + phone + "'";      
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
           // Tools.msgBox("Phone Is Delete");
        }
    }
    
    public void deleteByEmp(){
        String strDelete = "DELETE FROM employee_phones "
                + " WHERE empNo=" + empNo;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
           // Tools.msgBox("Phones Is Deleted");
        }
    }
    
    @Override
    public String getAutoNumber() {
        Tools.msgBox("getAutoNumber Method In Employee_phones Class Not Working! \n دالة إستدعاءرقم داخل كلاس أرقام الموظفين لا تعمل!");
        return "";
    }

    @Override
    public void getAllRows(JTable table) {
        String strSelect = "SELECT phone FROM employee_phones "
                + " WHERE empNo =" + empNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getOneRow(JTable table) {
        Tools.msgBox("getValueByName Method In Employee_phones Class Not Working! \n دالة إستدعاءرقم داخل كلاس أرقام الموظفين لا تعمل!");
        
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
         Tools.msgBox("getCustomRows Method In Employee_phones Class Not Working! \n دالة إستدعاءرقم داخل كلاس أرقام الموظفين لا تعمل!");
         
    }

    @Override
    public String getValueByName(String name) {
        Tools.msgBox("getValueByName Method In Employee_phones Class Not Working! \n دالة إستدعاءرقم داخل كلاس أرقام الموظفين لا تعمل!");
        return "";
    }

    @Override
    public String getNameByValue(String value) {
         Tools.msgBox("getNameByValue Method In Employee_phones Class Not Working! \n دالة إستدعاءرقم داخل كلاس أرقام الموظفين لا تعمل!");
         return "";
    }
    
    public String getEmpNOByPhone(String requestphone){
        
        String strSelect = "SELECT empNo FROM employee_phones"
                + " WHERE phone='" + requestphone + "'";
        Object row[][] = db.go.getTableData(strSelect).Items;
        String strEmpNo = "";
        if(row.length > 0){
            strEmpNo = (String)row[0][0];
        }
        else{
            strEmpNo = "0"; 
        }
        return strEmpNo;
    }
}
