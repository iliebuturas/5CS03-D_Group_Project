package jdbc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Group D
 */
public class Sample_JChart extends javax.swing.JFrame {

    /**
     * Creates new form jTableCode
     */
    public Sample_JChart() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton1.setText("ShowAll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BarChart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(0, 262, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();

        System.out.println("row clicked : " + row);
        //String tc = jTable1.getModel().getValueAt(row, 0).toString();
        int row_id = Integer.parseInt((String) jTable1.getModel().getValueAt(row, 0));
        int row_id1 = Integer.valueOf((String) jTable1.getModel().getValueAt(row, 0));
        System.out.println("row_id: " + row_id + " row_id1 " + row_id1);

        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;//con.createStatement();
        ResultSet rs = null;
        try {

            String sql = "select * from employee where empID=" + row_id;
            System.out.println("sql string for table row data :" + sql);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            if (rs.next()) {

                int id = rs.getInt("empID");
                String name = rs.getString("empName");
                String job = rs.getString("empJob");
                int sal = rs.getInt("empSal");

                System.out.println("row data :" + id + " " + name + " " + job + " " + sal);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        drawBar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Sample_JChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sample_JChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sample_JChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sample_JChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sample_JChart().setVisible(true);
            }
        });
    }

    public void showTable() {

        System.out.println("Show All Button clicked");
        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();

            rs = stmt.executeQuery("Select * from Road ");
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

    public void drawBar() {
        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;
        JDBCCategoryDataset dataset = null;

        try {

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Road limit 6");

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();

            String sql = "SELECT road_name, count(*) As Number_Of FROM Road GROUP BY road_name ";

            dataset = new JDBCCategoryDataset(con, sql);

            System.out.println("dataset cols and rows : " + dataset.getColumnCount() + "  " + dataset.getRowCount());

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

        JFreeChart chart = ChartFactory.createBarChart("Road name by road type",
                "Road types", "Road name count", dataset, PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.blue);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        BarRenderer renderer = (BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(true);
        renderer.setShadowVisible(true);
        renderer.setItemMargin(-4);
        renderer.setSeriesPaint(0, Color.blue);

        ChartFrame frame = new ChartFrame("Roads by types", chart);
        frame.setVisible(true);
        frame.setSize(400, 350);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
