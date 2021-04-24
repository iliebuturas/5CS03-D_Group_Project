/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vasilis
 */
public class LoginRegPanel extends javax.swing.JFrame {

    /**
     * Creates new form AuthGui
     */
    public LoginRegPanel() {
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
        jTextArea1 = new javax.swing.JTextArea();
        TopPanel = new javax.swing.JPanel();
        LogoPanel = new javax.swing.JPanel();
        LogoText = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        LogInPanel = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        LoginTitle = new javax.swing.JLabel();
        TitleText = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        SignUpPanel = new javax.swing.JPanel();
        RegisterBtn = new javax.swing.JButton();
        SignupTitle = new javax.swing.JLabel();
        SignupText = new javax.swing.JLabel();
        UsernameLb = new javax.swing.JLabel();
        rUsername = new javax.swing.JTextField();
        FirstNamelb = new javax.swing.JLabel();
        rFirstName = new javax.swing.JTextField();
        LastNameLb = new javax.swing.JLabel();
        rLastName = new javax.swing.JTextField();
        EmailLb = new javax.swing.JLabel();
        rEmail = new javax.swing.JTextField();
        PasswordLb = new javax.swing.JLabel();
        ConfirmPasswordLb = new javax.swing.JLabel();
        rPassword = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        ClearBtn = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 211, 19));

        TopPanel.setBackground(new java.awt.Color(255, 219, 11));
        TopPanel.setForeground(new java.awt.Color(255, 219, 187));

        LogoPanel.setBackground(new java.awt.Color(255, 226, 40));
        LogoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        LogoText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LogoText.setText("Traffic Data Visualization");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbc/traffix_logo_v1.png"))); // NOI18N
        Logo.setText("jLabel5");

        javax.swing.GroupLayout LogoPanelLayout = new javax.swing.GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoPanelLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoPanelLayout.createSequentialGroup()
                        .addComponent(LogoText)
                        .addGap(90, 90, 90))))
        );
        LogoPanelLayout.setVerticalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoText)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        LogInPanel.setBackground(new java.awt.Color(255, 226, 40));
        LogInPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Email.setText("Email");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Password.setText("Password");

        LoginBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        LoginTitle.setFont(new java.awt.Font("Century Gothic", 1, 39)); // NOI18N
        LoginTitle.setText("Log in");

        TitleText.setText("Log in to existing account");

        javax.swing.GroupLayout LogInPanelLayout = new javax.swing.GroupLayout(LogInPanel);
        LogInPanel.setLayout(LogInPanelLayout);
        LogInPanelLayout.setHorizontalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogInPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Email)
                    .addComponent(Password)
                    .addComponent(TitleText)
                    .addComponent(LoginTitle)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(LogInPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(password))
                .addGap(24, 24, 24))
        );
        LogInPanelLayout.setVerticalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LoginTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleText)
                .addGap(40, 40, 40)
                .addComponent(Email)
                .addGap(4, 4, 4)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(LoginBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SignUpPanel.setBackground(new java.awt.Color(255, 226, 40));
        SignUpPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        RegisterBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RegisterBtn.setText("Register");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        SignupTitle.setFont(new java.awt.Font("Century Gothic", 1, 39)); // NOI18N
        SignupTitle.setText("Sign Up");

        SignupText.setText("Register a new account");

        UsernameLb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UsernameLb.setText("Username");

        rUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUsernameActionPerformed(evt);
            }
        });

        FirstNamelb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FirstNamelb.setText("First name");

        LastNameLb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LastNameLb.setText("Last name");

        EmailLb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EmailLb.setText("Email");

        PasswordLb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordLb.setText("Password");

        ConfirmPasswordLb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ConfirmPasswordLb.setText("Confirm password");

        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ClearBtn.setText("Clear form");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUpPanelLayout = new javax.swing.GroupLayout(SignUpPanel);
        SignUpPanel.setLayout(SignUpPanelLayout);
        SignUpPanelLayout.setHorizontalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordLb)
                            .addComponent(EmailLb)
                            .addComponent(rEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(LastNameLb)
                            .addComponent(rLastName)
                            .addComponent(FirstNamelb)
                            .addComponent(rFirstName)
                            .addComponent(UsernameLb)
                            .addComponent(SignupText)
                            .addComponent(SignupTitle)
                            .addComponent(rUsername)
                            .addComponent(ConfirmPasswordLb)
                            .addComponent(rPassword)
                            .addComponent(jPasswordField2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addComponent(RegisterBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearBtn)
                        .addGap(93, 93, 93))))
        );
        SignUpPanelLayout.setVerticalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(SignupTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignupText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsernameLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstNamelb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastNameLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPasswordLb)
                .addGap(15, 15, 15)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterBtn)
                    .addComponent(ClearBtn))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SignUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        Connection con = connectUsersDB.getConnection();
        String rusername = rUsername.getText();
        String flag = "no";
        String rfname = rFirstName.getText();
        String rlname = rLastName.getText();
        String remail = rEmail.getText();
        String pwd1 = rPassword.getText();
        String pwd2 = jPasswordField2.getText();
        ResultSet usernameResultSet = registeredUserTable.get(rusername);
        ResultSet emailResultSet = registeredUserTable.get(remail);
        String emailRegex = "^(.+)@(.+)$";

        String checkUsernameDB = "SELECT username "
                + "FROM Users "
                + "WHERE username LIKE '" + rusername + "'";

        System.out.println("" + checkUsernameDB);
        Statement stmt = null;//con.createStatement();
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(checkUsernameDB);

            if (rs.next()) {

                String dbusername = rs.getString("username");

                System.out.println("row data :" + dbusername);
                if (rusername.equals("") || rusername == " " || rfname.equals("") || rlname.equals("") || remail.equals("") || pwd1.equals("") || pwd2.equals("")) {
                    JOptionPane.showMessageDialog(this, "Please fill out all fields!");
                } else if (dbusername.equals(rusername)) {
                    JOptionPane.showMessageDialog(this, "This username is already registered!");
                } else if (emailResultSet.next()) {
                    JOptionPane.showMessageDialog(this, "This email is already registered!");
                } else if (!remail.matches(emailRegex)) {
                    JOptionPane.showMessageDialog(this, "Email not in valid format!");
                } else if (!pwd1.equals(pwd2)) {
                    JOptionPane.showMessageDialog(this, "Passwords do not match!");
                }
            } else {
                registeredUserTable.insert(rusername, flag, rfname, rlname, remail, pwd1);

                JOptionPane.showMessageDialog(this, "You have been registered successfully.");

                rUsername.setText("");
                rFirstName.setText("");
                rLastName.setText("");
                rEmail.setText("");
                rPassword.setText("");
                jPasswordField2.setText("");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }finally {
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


    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        Connection con = connectUsersDB.getConnection();
        String uemail = email.getText();
        String upassword = password.getText();

        if (uemail.equals("") || upassword.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields");
            return;
        }

        String emailRegex = "^(.+)@(.+)$";
        if (!uemail.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Email not in valid format");
            return;
        }

        String checkLoginEmailDB = "SELECT email "
                + "FROM Users "
                + "WHERE email LIKE '" + uemail + "'";

        System.out.println("" + checkLoginEmailDB);
        Statement stmt = null;//con.createStatement();
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(checkLoginEmailDB);

            if (rs.next()) {

                String dbemail = rs.getString("email");

                System.out.println("row data :" + dbemail);

                if (dbemail.equals(uemail)) {
                    JOptionPane.showMessageDialog(this, "Successfully logged in");
                    AccountScreen gui2 = new AccountScreen(uemail, upassword);
                    gui2.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
                
            }else{
                    JOptionPane.showMessageDialog(this, "Wrong login details");
                }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }finally {
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

//        if (uemail == check) {
//            System.out.println("Welcome to account tab " + uemail + " " + rFirstName);
//        }
//        else{
//            System.out.println("Account not registered");
//        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed


    private void KeepSignedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeepSignedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeepSignedInActionPerformed

    private void TermsCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TermsCondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TermsCondActionPerformed

    private void rUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUsernameActionPerformed


    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed

        rUsername.setText("");
        rFirstName.setText("");
        rLastName.setText("");
        rEmail.setText("");
        rPassword.setText("");
        jPasswordField2.setText("");
    }//GEN-LAST:event_ClearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginRegPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRegPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRegPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel ConfirmPasswordLb;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EmailLb;
    private javax.swing.JLabel FirstNamelb;
    private javax.swing.JLabel LastNameLb;
    private javax.swing.JPanel LogInPanel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JLabel LogoText;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel PasswordLb;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JLabel SignupText;
    private javax.swing.JLabel SignupTitle;
    private javax.swing.JLabel TitleText;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel UsernameLb;
    private javax.swing.JTextField email;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField rEmail;
    private javax.swing.JTextField rFirstName;
    private javax.swing.JTextField rLastName;
    private javax.swing.JPasswordField rPassword;
    private javax.swing.JTextField rUsername;
    // End of variables declaration//GEN-END:variables
}
