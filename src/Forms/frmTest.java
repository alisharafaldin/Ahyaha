/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;
/*
import Entity.Department;
import Entity.Employee;
import Entity.Employee_Phones;
import Entity.Project;
*/
import Entity.*;
import company.Tools;

/**
 *
 * @author Ali
 */
public class frmTest extends javax.swing.JFrame {

    /**
     * Creates new form frmTest
     */
    public frmTest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTestDept = new controls.JMyButton();
        jMyButton1 = new controls.JMyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTest = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTest1 = new javax.swing.JTable();
        btnTestEmp = new controls.JMyButton();
        btnTestPhones = new controls.JMyButton();
        btnTestProject = new controls.JMyButton();
        TestWorkOn = new controls.JMyButton();
        btnBack = new controls.JMyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTestDept.setText("Test Department");
        btnTestDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestDeptActionPerformed(evt);
            }
        });

        jMyButton1.setText("jMyButton1");
        jMyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMyButton1ActionPerformed(evt);
            }
        });

        tblTest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTest);

        tblTest1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTest1);

        btnTestEmp.setText("Test Employee");
        btnTestEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestEmpActionPerformed(evt);
            }
        });

        btnTestPhones.setText("TestPhones");
        btnTestPhones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPhonesActionPerformed(evt);
            }
        });

        btnTestProject.setText("Test Project");
        btnTestProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestProjectActionPerformed(evt);
            }
        });

        TestWorkOn.setText("Test WorkOn");
        TestWorkOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestWorkOnActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTestDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnTestEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnTestPhones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnTestProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TestWorkOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jMyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTestDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnTestEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTestPhones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTestProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TestWorkOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestDeptActionPerformed
        Department dept = new Department();
           //dept.setDeptNo(1);
           //dept.setDeptName("IS");
           //dept.setLoction("Khartom");
           //dept.add();
           //dept.update();
           //dept.delete();
           //dept.getAllRows(tblTest);
           //Tools.msgBox(dept.getAutoNumber());
           //dept.getCustomRows("select * from department", tblTest);
           //dept.getOneRow(tblTest);
           //Tools.msgBox(dept.getValueByName("IS and Cs"));
        //Tools.msgBox(dept.getNameByValue("1"));
             
//Tools.CreateFolder("IS");
    }//GEN-LAST:event_btnTestDeptActionPerformed

    private void jMyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMyButton1ActionPerformed
        boolean confirm = Tools.confirmMsg("kljkjk");
        if(confirm) Tools.msgBox("Yes");
        else Tools.msgBox("Other");
    }//GEN-LAST:event_jMyButton1ActionPerformed

    private void btnTestEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestEmpActionPerformed
        Employee emp = new Employee();
        //emp.setEmpName("Omer Ahmed");
        //emp.setAddress("Doroshab");
        //emp.setSalary(190);
        //emp.setHiringDate("2010-06-01");
        //emp.setBirthDate("1982-10-09");
        //emp.setDeptNo(4);
        
        //emp.add();
        //emp.update();
        //emp.delete();
        
        //emp.getAllRows(tblTest);
        //Tools.msgBox(emp.getAutoNumber());
        //emp.getCustomRows("SELECT * FROM employee", tblTest);
        //Tools.msgBox(emp.getNameByValue("3"));
        //Tools.msgBox(emp.getValueByName("ali sharaf aldin"));
        //emp.setEmpNo(3);
        //emp.getOneRow(tblTest);
        

    }//GEN-LAST:event_btnTestEmpActionPerformed

    private void btnTestPhonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPhonesActionPerformed
        
        Employee_Phones phones = new Employee_Phones();
        
        phones.setEmpNo(1);
        phones.setPhone("011");
     
        
        //phones.add();
        //phones.delete();
        // phones.deleteByEmp();
        phones.getAllRows(tblTest);
    }//GEN-LAST:event_btnTestPhonesActionPerformed

    private void btnTestProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestProjectActionPerformed
        Project proj = new Project();
        
        //proj.setProjectNo(3);
        //proj.setProjectName("Project66 2");
        //proj.setLoction("بحري");
        //proj.setDeptNo(3);
        
        //proj.add();
        //proj.update();
        //proj.delete();
        
        //Tools.msgBox(proj.getAutoNumber());
        
        //proj.getAllRows(tblTest);
        
        //proj.setProjectNo(1);
        //proj.getOneRow(tblTest);
        
        //String strTest = "SELECT * FROM project";
        //proj.getCustomRows(strTest, tblTest);
        
        //Tools.msgBox(proj.getValueByName("Main Project"));
        
        //Tools.msgBox(proj.getNameByValue("1"));
        
    }//GEN-LAST:event_btnTestProjectActionPerformed

    private void TestWorkOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestWorkOnActionPerformed
        WorkOn work = new WorkOn();
        
        work.setEmpNo(6);
        work.setProjectNo(3);
        
        work.add();
        //work.delete();
        
        //work.getAllRows(tblTest);
        //work.getOneRow(tblTest);
        //work.getCustomRows("SELECT * FROM v_workon", tblTest);
    }//GEN-LAST:event_TestWorkOnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Tools.openForm(new frmMain());
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMyButton TestWorkOn;
    private controls.JMyButton btnBack;
    private controls.JMyButton btnTestDept;
    private controls.JMyButton btnTestEmp;
    private controls.JMyButton btnTestPhones;
    private controls.JMyButton btnTestProject;
    private controls.JMyButton jMyButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTest;
    private javax.swing.JTable tblTest1;
    // End of variables declaration//GEN-END:variables
}