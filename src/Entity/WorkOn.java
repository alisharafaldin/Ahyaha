
package Entity;

import company.Tools;
import javax.swing.JTable;

public class WorkOn implements mainData{
    
    private int empNo;
    private int projectNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    @Override
    public void add() {
        String strInsert = "INSERT INTO workon VALUES( "
                + empNo + ", "
                + projectNo + ")";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            Tools.msgBox("Work On Is Added ... \n تم إضافة الموظف إلى المشروع");
        }
    }

    @Override
    public void update() {
        Tools.msgBox("Update Method Not WorkOn Class \n لا يمكن التعديل ع العمل");
    }

    @Override
    public void delete() {
        String strDelete = "DELETE FROM workon WHERE "
                + "empNo=" + empNo
                + " AND "
                + "projectNo=" + projectNo;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            Tools.msgBox("Work On Is Deleted \n تم حذف العمل");
        }
    }

    @Override
    public String getAutoNumber() {
        Tools.msgBox("getAutoNumber Method Not WorkOn Class \n لا يمكن التعديل ع العمل");
        return "";
    }

    @Override
    public void getAllRows(JTable table) {
       db.go.fillToJTable("v_workon", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "SELECT * FROM v_workon WHERE "
                + "Employee_No=" + empNo
                + " AND "
                + "Project_No=" +  projectNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
       db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
          Tools.msgBox("getValueByName Method Not WorkOn Class \n لا يمكن التعديل ع العمل");
          return "";
    }

    @Override
    public String getNameByValue(String value) {
        Tools.msgBox("getNameByValue Method Not WorkOn Class \n لا يمكن التعديل ع العمل");
        return "";
    }
    
}
