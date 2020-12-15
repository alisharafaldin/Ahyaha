
package Entity;

import company.Tools;
import javax.swing.JTable;

public class Project implements mainData
{
    private int projectNo;
    private String projectName;
    private String loction;
    private int deptNo;

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLoction() {
        return loction;
    }

    public void setLoction(String loction) {
        this.loction = loction;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public void add() {
        String  strInsert = "INSERT INTO project VALUES("
                + projectNo + ","
                + "'" + projectName + "',"
                + "'" + loction + "',"
                + deptNo + ")";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            Tools.msgBox("Project Is Add \n تم إضافة مشروع جديد");
        }
    }

    @Override
    public void update() {
        String strUpdate = "UPDATE project SET "
                + " projectName='" + projectName + "',"
                + " location='" + loction + "',"
                + " deptNO=" + deptNo
                + " WHERE projectNo=" + projectNo;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
            Tools.msgBox("Project Is Update \n تم تحديث بيانات المشروع");
        }
    }

    @Override
    public void delete() {
         String strDelete = "DELETE FROM project "
                 + " WHERE projectNo=" + projectNo;
         boolean isDelete = db.go.runNonQuery(strDelete);
         if(isDelete){
             Tools.msgBox("Project Is Deleted ... \n تم حذف بيانات المشروع ..");
         }
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("project", "projectNo");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("v_project", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "SELECT * FROM v_project "
                + " WHERE project_No=" + projectNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
       String strSelect = " SELECT projectNo FROM project "
               + " WHERE projectName='" + name + "'";
       String strVal = db.go.getTableData(strSelect).Items[0][0].toString();
       return strVal;
    }

    @Override
    public String getNameByValue(String value) {
       String strSelect = "SELECT projectName FROM project "
               + " WHERE projectNo=" + value;
       String strName = db.go.getTableData(strSelect).Items[0][0].toString();
       return strName;
    }
    
    
}
