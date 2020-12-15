
package Entity;

import company.Tools;
import javax.swing.JTable;


public class Department implements mainData{
    private int DeptNo;
    private String DeptName;
    private String Location;
    public JTable tblDept1;
    public JTable tblDept;
    public JTable tblDept2;
    // End of variables declaration

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLoction() {
        return Location;
    }

    public void setLoction(String Loction) {
        this.Location = Loction;
    }

    @Override
    public void add() {
      String strInsert = "INSERT INTO department VALUES("
              + DeptNo + ", "
              + "'" + DeptName + "',"
              + "'" + Location + "')";
      boolean isAdd = db.go.runNonQuery(strInsert);
      if(isAdd){
          Tools.msgBox("Department Is Added \n تم إضافة قسم");
      }
    }

    @Override
    public void update() {
      String strUpdate = "UPDATE department set "
              + "deptName='" + DeptName + "',"
              + "location='" + Location + "' "
              + "WHERE deptNo=" + DeptNo;
      boolean isUpdate = db.go.runNonQuery(strUpdate);
      if(isUpdate){
          Tools.msgBox("Department Is Updated \n تم تحديث القسم");
      }
    }

    @Override
    public void delete() {
       String strDelete = "DELETE FROM department "
               + "WHERE deptNo=" + DeptNo;
       boolean isDelete = db.go.runNonQuery(strDelete);
       if(isDelete){
           Tools.msgBox("Department Is Deleted \n تم خدف القسم");
       }
    }

    @Override
    public String getAutoNumber() {
     //   String strAuto = db.go.getAutoNumber("department", "deptNo");
        return db.go.getAutoNumber("department", "deptNo"); // أو إختصار الكود
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("v_department", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "SELECT * FROM department " 
                + "WHERE deptNo=" + DeptNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
      db.go.fillToJTable(statement, table);
    }

     @Override
    public String getValueByName(String name) {
        String strSelect = "SELECT deptNO FROM department"
                + " WHERE deptName='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
    
    @Override
    public String getNameByValue(String value) {
     String strSelect = "SELECT deptName FROM department"
             + " WHERE deptNO=" + value;
     String strName = (String)db.go.getTableData(strSelect).Items[0][0];
     return strName;
    }

   
}
