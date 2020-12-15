
package Entity;

import javax.swing.JTable;

public interface mainData {
    
    public void add();
    
    public void update();
    
    public void delete();
    
    public String getAutoNumber();
    
    public void getAllRows(JTable table); // لتعبئة الجدول بالبيانات
    
    public void getOneRow(JTable table); // جلب سجل واحد 
          
    public void getCustomRows(String statement, JTable table); // اخز جملة الإستعلام وارسالها للجدول
    
    public String getValueByName(String name);
    
    public String getNameByValue(String value);
    
}
