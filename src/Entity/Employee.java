
package Entity;

import company.Tools;
import javax.swing.JTable;

public class Employee implements mainData{
        
    private int EmpNo;
    private String EmpName;
    private String Address;
    private double Salary;
    private String HiringDate;
    private String BirthDate;
    private int DeptNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    @Override
    public void add() {
        String strInsert = "INSERT INTO employee VALUES("
                + EmpNo + "," 
                + "'" + EmpName + "',"
                + "'" + Address + "',"
                + Salary + ","
                + "'" + HiringDate + "',"
                + "'" + BirthDate + "',"
                + DeptNo + ")";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            Tools.msgBox("Employee Is Added \n تم إضافة موظف جديد بنجاح");
        }
        
    }   

    @Override
    public void update() {
        String strUpbate = "UPDATE employee SET "
                + "empName='" + EmpName + "',"
                + "address='" + Address + "',"
                + "salary=" + Salary + ","
                + "hiringDate='" + HiringDate + "',"
                + "birthDate='" + BirthDate + "',"
                + "deptNo=" + DeptNo 
                + " WHERE empNo=" + EmpNo;
        boolean isUpdate = db.go.runNonQuery(strUpbate);
        if(isUpdate){
            Tools.msgBox("Employee Is Updated \n تم تحديث بيانات الموظف بنجاح");
        }
    }

    @Override
    public void delete() {
        String strDelete = "DELETE FROM employee"
                + " WHERE empNo=" + EmpNo;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            Tools.msgBox("Employee Is Deleteي \n تم حزف الموظف بنجاح");
        }
         
    }

    @Override
    public String getAutoNumber() { // إرسال الترقيم التلقائي
       return db.go.getAutoNumber("v_employee", "Employee_No");
    }

    @Override
    public void getAllRows(JTable table) { //
        db.go.fillToJTable("v_employee", table);
    }

    @Override
    public void getOneRow(JTable table) { //
        String strSelect = "SELECT * FROM v_employee"
                + " WHERE Employee_No=" + EmpNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) { //
       db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String srtSelect = "SELECT Employee_No FROM v_employee"
                + " WHERE Employee_Name ='" + name + "'";
        String strVal = db.go.getTableData(srtSelect).Items[0][0].toString();
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "SELECT empName FROM v_employee"
                + " WHERE Employee_No=" + value;
        String strName = db.go.getTableData(strSelect).Items[0][0].toString();
        return strName;
    }
    
    
}
