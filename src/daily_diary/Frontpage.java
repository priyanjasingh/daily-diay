/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily_diary;

import static daily_diary.Login.login_status;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author avishkar
 */
public class Frontpage extends javax.swing.JFrame {

    /**
     * Creates new form Frontpage
     */
    public Frontpage() {
        initComponents();
       bt_notes.setVisible(false);
        bt_todo.setVisible(false);
        
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
        bt_login = new javax.swing.JButton();
        bt_notes = new javax.swing.JButton();
        bt_todo = new javax.swing.JButton();
        bt_signup = new javax.swing.JButton();
        DisplayPanel = new javax.swing.JPanel();
        home1 = new daily_diary.Home();
        login1 = new daily_diary.Login();
        notes1 = new daily_diary.Notes();
        sign_up1 = new daily_diary.Sign_up();
        todo = new daily_diary.Todo();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 9, 7));

        bt_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daily_diary/rsz_login11.png"))); // NOI18N
        bt_login.setBorder(null);
        bt_login.setBorderPainted(false);
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        bt_notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daily_diary/rsz_notesssss.png"))); // NOI18N
        bt_notes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_notes.setBorderPainted(false);
        bt_notes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_notesActionPerformed(evt);
            }
        });

        bt_todo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daily_diary/rsz_to_do.png"))); // NOI18N
        bt_todo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_todo.setBorderPainted(false);
        bt_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_todoActionPerformed(evt);
            }
        });

        bt_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daily_diary/rsz_sign_up.png"))); // NOI18N
        bt_signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_signup.setBorderPainted(false);
        bt_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_notes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_todo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_notes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DisplayPanel.setLayout(new java.awt.CardLayout());
        DisplayPanel.add(home1, "home");
        DisplayPanel.add(login1, "login");
        DisplayPanel.add(notes1, "notes");
        DisplayPanel.add(sign_up1, "signup");
        DisplayPanel.add(todo, "todo");

        jPanel3.setBackground(new java.awt.Color(46, 28, 9));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daily_diary/rsz_11rpc-designers-diary-banner.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signupActionPerformed
        // TODO add your handling code here:
        CardLayout Card = (CardLayout)DisplayPanel.getLayout();
     
        Card.show(DisplayPanel, "signup");
    }//GEN-LAST:event_bt_signupActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        // TODO add your handling code here:
        if(login_status == 0)
        {
        CardLayout Card = (CardLayout)DisplayPanel.getLayout();
     
        Card.show(DisplayPanel, "login");
        
        }
        else
        {
            CardLayout Card = (CardLayout)DisplayPanel.getLayout();
     
            Card.show(DisplayPanel, "home");
            JOptionPane.showMessageDialog(null, "LOGOUT SUCCESSFULL");
            bt_signup.setVisible(true);
            bt_todo.setVisible(false);
            bt_notes.setVisible(false);
            login_status=0;
            bt_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daily_diary/rsz_login11.png"))); // NOI18N

         }
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_notesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_notesActionPerformed
        // TODO add your handling code here:
        CardLayout Card = (CardLayout)DisplayPanel.getLayout();
        Notes.bt_delete.setVisible(false);
        Card.show(DisplayPanel, "notes");
        Notes.Refresh_notes();
    }//GEN-LAST:event_bt_notesActionPerformed

    private void bt_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_todoActionPerformed
        // TODO add your handling code here:
        CardLayout Card = (CardLayout)DisplayPanel.getLayout();
        Todo.bt_savechanges.setVisible(false);
        Todo.bt_save.setVisible(false);
        Todo.tf_new.setEditable(false);
        Todo.bt_update.setVisible(false);
        Todo.bt_delete.setVisible(false);
        Card.show(DisplayPanel, "todo");
        Todo.Refresh_list();
    }//GEN-LAST:event_bt_todoActionPerformed

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
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frontpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel DisplayPanel;
    public static javax.swing.JButton bt_login;
    public static javax.swing.JButton bt_notes;
    public static javax.swing.JButton bt_signup;
    public static javax.swing.JButton bt_todo;
    public static daily_diary.Home home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static daily_diary.Login login1;
    public static daily_diary.Notes notes1;
    public static daily_diary.Sign_up sign_up1;
    public static daily_diary.Todo todo;
    // End of variables declaration//GEN-END:variables
}
