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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Group D
 */
public class RawDbData extends javax.swing.JFrame {

    /**
     * Creates new form jTableCode
     */
    public RawDbData() {
        initComponents();
    }
    public RawDbData(String email) {
        initComponents();
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
        GraphsTabBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JButton();
        AccountTabBtn = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ShowRegionBtn = new javax.swing.JButton();
        ShowRoadBtn = new javax.swing.JButton();
        ShowLocalAuBtn = new javax.swing.JButton();

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
        jLabel1.setText("Database raw data");

        GraphsTabBtn.setText("Graphs Tab");
        GraphsTabBtn.setToolTipText("");
        GraphsTabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphsTabBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(ClearTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GraphsTabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GraphsTabBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel7.setBackground(new java.awt.Color(255, 219, 11));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbc/traffix_logo_v1.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        LogOutBtn.setText("Logout");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        AccountTabBtn.setText("Account tab");
        AccountTabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountTabBtnActionPerformed(evt);
            }
        });

        emailLabel.setText("User");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(AccountTabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogOutBtn)
                    .addComponent(AccountTabBtn))
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 219, 11));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        ShowRegionBtn.setText("Show Region Data");
        ShowRegionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRegionBtnActionPerformed(evt);
            }
        });

        ShowRoadBtn.setText("Show Road Data");
        ShowRoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRoadBtnActionPerformed(evt);
            }
        });

        ShowLocalAuBtn.setText("Show Local Authority ");
        ShowLocalAuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLocalAuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowLocalAuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ShowRoadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowRegionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ShowRegionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowRoadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowLocalAuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowRoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowRoadBtnActionPerformed
        // TODO add your handling code here:
        clearTable(); //clear previous data
        showRoadTable(); //add new data
    }//GEN-LAST:event_ShowRoadBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();

        System.out.println("row clicked : " + row);
        String tc = jTable1.getModel().getValueAt(row, 0).toString();
        int tc_id = Integer.parseInt((String) jTable1.getModel().getValueAt(row, 0));
        int id1 = Integer.valueOf((String) jTable1.getModel().getValueAt(row, 0));
        System.out.println("tc_id: " + tc_id + " id1 " + id1);
        System.out.println("data at clicked row: " + tc);
        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;//con.createStatement();
        ResultSet rs = null;
        try {

            //String sql1 = "select * from employee where empID=" + tc + "";
            String sql = "select * from Road where road_name=" + tc_id;
            System.out.println("sql string for table row data :" + sql);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            if (rs.next()) {

                String roadName = rs.getString("road_name");
                String roadType = rs.getString("road_type");
                String localAuthority = rs.getString("local_authority_id");

                System.out.println("row data :" + roadName + " " + roadType + " " + localAuthority);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {

            try {
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void ClearTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTableBtnActionPerformed
        clearTable();
    }//GEN-LAST:event_ClearTableBtnActionPerformed

    private void ShowLocalAuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLocalAuBtnActionPerformed
        clearTable();
        showLocalAuTable();    }//GEN-LAST:event_ShowLocalAuBtnActionPerformed

    private void ShowRegionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowRegionBtnActionPerformed
        clearTable();
        showRegionTable();
    }//GEN-LAST:event_ShowRegionBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        LoginRegPanel loginPanel = new LoginRegPanel();
        loginPanel.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void AccountTabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountTabBtnActionPerformed
        String email = emailLabel.getText();
        AccountScreen accGui = new AccountScreen(email);
        accGui.setLocationRelativeTo(null);
        accGui.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_AccountTabBtnActionPerformed

    private void GraphsTabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphsTabBtnActionPerformed
        String email = emailLabel.getText();
        GraphsTab graphGui = new GraphsTab(email);
        graphGui.setLocationRelativeTo(null);
        graphGui.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_GraphsTabBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RawDbData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RawDbData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RawDbData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RawDbData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RawDbData().setVisible(true);
            }
        });
    }

    public void clearTable() {
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        // clear existing columns 
        tm.setColumnCount(0);
        // clear existing rows
        tm.setRowCount(0);
        //tm.fireTableDataChanged();
        System.out.println("Show tableClear clicked");
    }

    public void showRoadTable() {

        System.out.println("Show All Button clicked");
        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();

            rs = stmt.executeQuery("Select * from Road");
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

    public void showRegionTable() {

        System.out.println("Show All Button clicked");
        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();

            rs = stmt.executeQuery("Select * from Region");
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

    public void showLocalAuTable() {

        System.out.println("Show All Button clicked");
        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();

            rs = stmt.executeQuery("Select * from Local_Authority");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountTabBtn;
    private javax.swing.JButton ClearTableBtn;
    private javax.swing.JButton GraphsTabBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton ShowLocalAuBtn;
    private javax.swing.JButton ShowRegionBtn;
    private javax.swing.JButton ShowRoadBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
