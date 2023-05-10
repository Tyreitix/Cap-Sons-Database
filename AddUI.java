/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
public class AddUI extends javax.swing.JFrame {

    /**
     * Creates new form AddUI
     */
    public AddUI() {
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

        toStaff = new javax.swing.JButton();
        toEquip = new javax.swing.JButton();
        toProject = new javax.swing.JButton();
        MMButton = new javax.swing.JButton();
        toCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add");
        setLocation(new java.awt.Point(200, 100));
        setSize(new java.awt.Dimension(1080, 720));

        toStaff.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        toStaff.setText("Staff Member");
        toStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStaffActionPerformed(evt);
            }
        });

        toEquip.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        toEquip.setText("Equipment");
        toEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toEquipActionPerformed(evt);
            }
        });

        toProject.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        toProject.setText("Project");
        toProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toProjectActionPerformed(evt);
            }
        });

        MMButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        MMButton.setText("Main Menu");
        MMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMButtonActionPerformed(evt);
            }
        });

        toCustomer.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        toCustomer.setText("Customer");
        toCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toProject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(toStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(toEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(toProject, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(toCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(MMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStaffActionPerformed
        addStaff staff = new addStaff();
        staff.setVisible(true);
        dispose();
    }//GEN-LAST:event_toStaffActionPerformed

    private void toProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toProjectActionPerformed
        addProject project = new addProject();
        project.setVisible(true);
        dispose();
    }//GEN-LAST:event_toProjectActionPerformed

    private void MMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMButtonActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_MMButtonActionPerformed

    private void toEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toEquipActionPerformed
        addEquipment equip = new addEquipment();
        equip.setVisible(true);
        dispose();
    }//GEN-LAST:event_toEquipActionPerformed

    private void toCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCustomerActionPerformed
        addCustomer cust = new addCustomer();
        cust.setVisible(true);
        dispose();
    }//GEN-LAST:event_toCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(AddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MMButton;
    private javax.swing.JButton toCustomer;
    private javax.swing.JButton toEquip;
    private javax.swing.JButton toProject;
    private javax.swing.JButton toStaff;
    // End of variables declaration//GEN-END:variables
}
