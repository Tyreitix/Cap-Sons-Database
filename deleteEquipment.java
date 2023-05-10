/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package databasegui;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Tyrei
 */
public class deleteEquipment extends javax.swing.JFrame {

    /**
     * Creates new form deleteEquipment
     */
    public deleteEquipment() {
        initComponents();
        show_equipment();
    }

    public ArrayList<Equipment> equipmentList(){
        ArrayList<Equipment> equipmentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            System.out.println(e);
        }

        final String ID = "tshaw7";
        final String PW = "COSC*dw7o7";
        final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tshaw7db?useSSL=false";
        try{
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        String query1 = "SELECT * FROM tshaw7db.Equipment";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        Equipment equipment;
        while(rs.next()){
            equipment = new Equipment(rs.getString("Type"), rs.getString("Amount"));
            equipmentList.add(equipment);
        }
        }catch(SQLException e){
            System.out.println(e);
        }
               return equipmentList; 
    }
    
     public void show_equipment(){
        ArrayList<Equipment> list = equipmentList();
        DefaultTableModel model = (DefaultTableModel)Equipment.getModel();
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).gettype();
            row[1] = list.get(i).getamount();
            model.addRow(row);
        }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MMButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        Type = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backButton18 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Equipment = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipment Deletion");
        setLocation(new java.awt.Point(200, 100));

        MMButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        MMButton.setText("Main Menu");
        MMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        Type.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Type");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Equipment Deletion");

        backButton18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        backButton18.setText("Back");
        backButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton18ActionPerformed(evt);
            }
        });

        Equipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Amount"
            }
        ));
        Equipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EquipmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Equipment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(backButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(177, 177, 177))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMButtonActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_MMButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch(Exception e){
            System.out.println(e);
        }

        final String ID = "tshaw7";
        final String PW = "COSC*dw7o7";
        final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tshaw7db?useSSL=false";

        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);

            String sql = "DELETE from tshaw7db.Equipment where Type = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,Type.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipment: " + Type.getText() +  " has successfully been deleted");
            DefaultTableModel model = (DefaultTableModel)Equipment.getModel();
            model.setRowCount(0);
            show_equipment();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeActionPerformed

    private void backButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton18ActionPerformed
        DeleteUI del = new DeleteUI();
        del.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButton18ActionPerformed

    private void EquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquipmentMouseClicked
        int i = Equipment.getSelectedRow();
        TableModel model = Equipment.getModel();
        Type.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_EquipmentMouseClicked

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
            java.util.logging.Logger.getLogger(deleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Equipment;
    private javax.swing.JButton MMButton;
    private javax.swing.JTextField Type;
    private javax.swing.JButton backButton18;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
