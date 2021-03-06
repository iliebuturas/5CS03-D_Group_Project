/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Group D
 * @author Keith Reyes
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form jTableCode
     */
    public AdminPanel() {
        initComponents();
        showUsersTable();
    }
public AdminPanel(String email) {
        initComponents();
        showUsersTable();
        deleteUserB.setEnabled(false);
        giveAdminB.setEnabled(false);
        removeAdminB.setEnabled(false);
        removeActivityB.setEnabled(false);
        emailLabel.setText(email);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ClearTableBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ShowUsersBtn = new javax.swing.JButton();
        showActivityB = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        accountTabB = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        deleteUserB = new javax.swing.JButton();
        giveAdminB = new javax.swing.JButton();
        selectedUserLabel = new javax.swing.JLabel();
        sUserLabel = new javax.swing.JLabel();
        removeAdminB = new javax.swing.JButton();
        removeActivityB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 219, 11));

        jPanel1.setBackground(new java.awt.Color(255, 215, 11));

        jPanel6.setBackground(new java.awt.Color(255, 226, 30));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        jScrollPane1.setBackground(new java.awt.Color(255, 226, 40));
        jScrollPane1.setForeground(new java.awt.Color(186, 186, 186));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ClearTableBtn.setText("Clear Table");
        ClearTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTableBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Display Users");

        ShowUsersBtn.setText("Show Users");
        ShowUsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowUsersBtnActionPerformed(evt);
            }
        });

        showActivityB.setText("Show Activity");
        showActivityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActivityBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ClearTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(showActivityB, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(ShowUsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showActivityB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowUsersBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jPanel7.setBackground(new java.awt.Color(255, 219, 11));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbc/traffix_logo_v1.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        accountTabB.setText("Account tab");
        accountTabB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTabBActionPerformed(evt);
            }
        });

        emailLabel.setText("Admin Email");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountTabB, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(accountTabB)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel)
                        .addGap(8, 8, 8))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 219, 11));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        deleteUserB.setText("Delete User");
        deleteUserB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBActionPerformed(evt);
            }
        });

        giveAdminB.setText("Give Admin");
        giveAdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveAdminBActionPerformed(evt);
            }
        });

        selectedUserLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        selectedUserLabel.setText("No user specified...");

        sUserLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sUserLabel.setText("Selected User:");

        removeAdminB.setText("Remove Admin");
        removeAdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAdminBActionPerformed(evt);
            }
        });

        removeActivityB.setText("Remove Activity");
        removeActivityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActivityBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteUserB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giveAdminB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sUserLabel))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(selectedUserLabel)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(removeActivityB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeAdminB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sUserLabel)
                .addGap(18, 18, 18)
                .addComponent(selectedUserLabel)
                .addGap(31, 31, 31)
                .addComponent(deleteUserB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(giveAdminB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeAdminB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeActivityB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteUserBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBActionPerformed
        // TODO add your handling code here:
        String username = selectedUserLabel.getText();
        removeTimeStamp(username);
        deleteUser(username);
        clearTable();
        showUsersTable();
    }//GEN-LAST:event_deleteUserBActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();

        System.out.println("row clicked : " + row);
        String tc = jTable1.getModel().getValueAt(row, 0).toString();
        selectedUserLabel.setText(tc);
    }//GEN-LAST:event_jTable1MouseClicked

    private void ClearTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTableBtnActionPerformed
        clearTable();
        selectedUserLabel.setText("Select user...");
    }//GEN-LAST:event_ClearTableBtnActionPerformed

    private void ShowUsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowUsersBtnActionPerformed
        jLabel1.setText("Display users");
        deleteUserB.setEnabled(true);
        giveAdminB.setEnabled(true);
        removeAdminB.setEnabled(true);
        removeActivityB.setEnabled(false);
        showUsersTable();
    }//GEN-LAST:event_ShowUsersBtnActionPerformed

    private void accountTabBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTabBActionPerformed
        String email = emailLabel.getText();
        AccountScreen accPanel = new AccountScreen(email);
        accPanel.setLocationRelativeTo(null);
        accPanel.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_accountTabBActionPerformed

    private void giveAdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveAdminBActionPerformed
        // TODO add your handling code here:
        String username = selectedUserLabel.getText();
        String adminCheck = isSelectedUserAdmin(username);
        if(adminCheck.equals("no")){
            giveAdmin(username);
            clearTable();
            showUsersTable();
        }else{
            JOptionPane.showMessageDialog(this, "This user is already admin!");
        }
        
    }//GEN-LAST:event_giveAdminBActionPerformed

    private void removeAdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAdminBActionPerformed
        // TODO add your handling code here:
        String username = selectedUserLabel.getText();
        String adminCheck = isSelectedUserAdmin(username);
        if(adminCheck.equals("Yes")){
            removeAdmin(username);
            clearTable();
            showUsersTable();
        }else{
            JOptionPane.showMessageDialog(this, "This user is not admin!");
        }
    }//GEN-LAST:event_removeAdminBActionPerformed

    private void showActivityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActivityBActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("User activity");
        removeActivityB.setEnabled(true);
        clearTable();
        showActivityTable();
    }//GEN-LAST:event_showActivityBActionPerformed

    private void removeActivityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActivityBActionPerformed
        // TODO add your handling code here:
        String username = selectedUserLabel.getText();
        removeTimeStamp(username);
        clearTable();
        showActivityTable();
    }//GEN-LAST:event_removeActivityBActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    private void clearTable() {
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        // clear existing columns 
        tm.setColumnCount(0);
        // clear existing rows
        tm.setRowCount(0);
        deleteUserB.setEnabled(false);
        giveAdminB.setEnabled(false);
        removeAdminB.setEnabled(false);
        //tm.fireTableDataChanged();
        System.out.println("Show tableClear clicked");
    }

    private void showUsersTable() {

        System.out.println("Show All Button clicked");
        Connection con = connectUsersDB.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();

            rs = stmt.executeQuery("Select * from Users");
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();

            // clear existing columns 
            tm.setColumnCount(0);

            // add specified columns to table
            for (int i = 1; i <= columnCount; i++) {
                tm.addColumn(rsmd.getColumnName(i));
            }

            // clear existing rows
            tm.setRowCount(0);

            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i + 1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();

            rs.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
    }
    
    private void showActivityTable() {

        System.out.println("Show All Button clicked");
        Connection con = connectUsersDB.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();

            rs = stmt.executeQuery("Select username,loginTime,logoutTime from Activity");
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();

            // clear existing columns 
            tm.setColumnCount(0);

            // add specified columns to table
            for (int i = 1; i <= columnCount; i++) {
                tm.addColumn(rsmd.getColumnName(i));
            }

            // clear existing rows
            tm.setRowCount(0);

            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i + 1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();

            rs.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
    }    
    
    private String isSelectedUserAdmin(String username) {
        Connection conn = connectUsersDB.getConnection();
        String sql = "SELECT adminFlag FROM Users WHERE username = '" + username + "'";
        ResultSet result = null;
        String adminCheck;
        try {
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);
            
            adminCheck = result.getString("adminFlag");
            conn.close();
            return adminCheck;
        } catch (SQLException e) {
            System.out.println("Error while getting from Users table" + e.getMessage());
            return "Yes";
        }
    }
    private void giveAdmin(String username) {
            Connection con = connectUsersDB.getConnection();
            Statement stmt = null;
            
            // get date/time
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            String sql1 = ("INSERT OR IGNORE INTO User_Admin(username,datePromoted) "
                    + "VALUES ('" + username + "','" + dtf.format(now) + "');");
            String sql2 = ("UPDATE Users SET adminFlag='Yes' WHERE username='" + username + "';");
            try {
                con.setAutoCommit(false);
                stmt = con.createStatement();
                stmt.executeUpdate(sql1);
                System.out.println("Added to database User_Admin!");
                stmt.executeUpdate(sql2);
                System.out.println("Users Table Updated!");
                stmt.close();
                con.commit();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
            }
        }
    private void deleteUser(String username) {
            Connection con = connectUsersDB.getConnection();
            Statement stmt = null;

            String sql1 = ("DELETE FROM User_Admin WHERE username='" + username + "';");
            String sql2 = ("DELETE FROM Users WHERE username='" + username + "';");
            try {
                con.setAutoCommit(false);
                stmt = con.createStatement();
                stmt.executeUpdate(sql1);
                System.out.println("User Removed from database User_Admin!");
                stmt.executeUpdate(sql2);
                System.out.println("User Removed from database Users!");
                stmt.close();
                con.commit();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
            }
        } 
    private void removeAdmin(String username) {
            Connection con = connectUsersDB.getConnection();
            Statement stmt = null;
            
            // get date/time
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            String sql1 = ("DELETE FROM User_Admin WHERE username='" + username + "';");
            String sql2 = ("UPDATE Users SET adminFlag='no' WHERE username='" + username + "';");
            try {
                con.setAutoCommit(false);
                stmt = con.createStatement();
                stmt.executeUpdate(sql1);
                System.out.println("User Removed from database User_Admin!");
                stmt.executeUpdate(sql2);
                System.out.println("Users Table Updated!");
                stmt.close();
                con.commit();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
            }
        }
    private void removeTimeStamp(String username) {
            Connection con = connectUsersDB.getConnection();
            Statement stmt = null;
            
            String sql1 = ("DELETE FROM Activity WHERE username='" + username + "';");
            try {
                con.setAutoCommit(false);
                stmt = con.createStatement();
                stmt.executeUpdate(sql1);
                System.out.println("User Activity Removed from database Activity!");
                stmt.close();
                con.commit();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                    }
                }
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearTableBtn;
    private javax.swing.JButton ShowUsersBtn;
    private javax.swing.JButton accountTabB;
    private javax.swing.JButton deleteUserB;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton giveAdminB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton removeActivityB;
    private javax.swing.JButton removeAdminB;
    private javax.swing.JLabel sUserLabel;
    private javax.swing.JLabel selectedUserLabel;
    private javax.swing.JButton showActivityB;
    // End of variables declaration//GEN-END:variables
}
