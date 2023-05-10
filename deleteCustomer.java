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
public class deleteCustomer extends javax.swing.JFrame {

    /**
     * Creates new form deleteCustomer
     */
    public deleteCustomer() {
        initComponents();
        show_customer();
    }
    
    public ArrayList<Customer> customerList(){
        ArrayList<Customer> customerList = new ArrayList<>();
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
        String query1 = "SELECT * FROM tshaw7db.Customer";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        Customer customer;
        while(rs.next()){
            customer = new Customer(rs.getInt("CID"), rs.getString("Fname"), rs.getString("Lname"));
            customerList.add(customer);
        }
        }catch(SQLException e){
            System.out.println(e);
        }
               return customerList; 
    }
    
    public void show_customer(){
        ArrayList<Customer> list = customerList();
        DefaultTableModel model = (DefaultTableModel)Customers.getModel();
        Object[] row = new Object[3];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getcustomerID();
            row[1] = list.get(i).getfname();
            row[2] = list.get(i).getlname();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        MMButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        CID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Deletion");
        setLocation(new java.awt.Point(200, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Customer ID");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Customer Deletion");

        backButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

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

        CID.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDActionPerformed(evt);
            }
        });

        Customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "First Name", "Last Name"
            }
        ));
        Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        DeleteUI del = new DeleteUI();
        del.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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

            String sql = "DELETE from tshaw7db.Customer where CID = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(CID.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Customer: " + CID.getText() +  " has successfully been deleted");
            DefaultTableModel model = (DefaultTableModel)Customers.getModel();
            model.setRowCount(0);
            show_customer();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void CIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIDActionPerformed

    private void CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersMouseClicked
        int i = Customers.getSelectedRow();
        TableModel model = Customers.getModel();
        CID.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_CustomersMouseClicked

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
            java.util.logging.Logger.getLogger(deleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CID;
    private javax.swing.JTable Customers;
    private javax.swing.JButton MMButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
