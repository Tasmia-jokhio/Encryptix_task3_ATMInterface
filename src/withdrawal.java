
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jokhi
 */
public class withdrawal extends javax.swing.JFrame {
    
   String inputamount;
   private ATM atm;
   private Balance b;
    /**
     * Creates new form deposit
     * @param atm
     * @param b     
     */
    public withdrawal(ATM atm, Balance b) {
        initComponents();
        this.atm=atm;
        this.b=b;
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
        inputamount_txt = new javax.swing.JTextField();
        btn_1 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_enter = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        db_back_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 5, 186));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please enter your amount ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 530, 60));

        inputamount_txt.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        inputamount_txt.setForeground(new java.awt.Color(5, 5, 186));
        inputamount_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputamount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputamount_txtActionPerformed(evt);
            }
        });
        getContentPane().add(inputamount_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 350, 60));

        btn_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(5, 5, 186));
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 60, 60));

        btn_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(5, 5, 186));
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 60, 60));

        btn_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(5, 5, 186));
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 60, 60));

        btn_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(5, 5, 186));
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 60, 60));

        btn_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(5, 5, 186));
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 60, 60));

        btn_0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(5, 5, 186));
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 60, 60));

        btn_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(5, 5, 186));
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 60, 60));

        btn_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(5, 5, 186));
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 60, 60));

        btn_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(5, 5, 186));
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 60, 60));

        btn_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(5, 5, 186));
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 60, 60));

        btn_enter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_enter.setForeground(new java.awt.Color(5, 5, 186));
        btn_enter.setText("Enter");
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 110, 50));

        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(5, 5, 186));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 110, 50));

        db_back_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        db_back_btn.setForeground(new java.awt.Color(5, 5, 186));
        db_back_btn.setText("Exit");
        db_back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db_back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(db_back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 110, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputamount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputamount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputamount_txtActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
     inputamount=inputamount_txt.getText()+btn_1.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
     inputamount=inputamount_txt.getText()+btn_9.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
    inputamount=inputamount_txt.getText()+btn_8.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
        
        try{
        int enteredamount=Integer.parseInt(inputamount_txt.getText());
        b.withdrawamount(enteredamount, atm, this);
          
       
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer amount.");
        }
    }//GEN-LAST:event_btn_enterActionPerformed

    private void db_back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db_back_btnActionPerformed
       
        atm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_db_back_btnActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
     inputamount=inputamount_txt.getText()+btn_2.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
     inputamount=inputamount_txt.getText()+btn_3.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
     inputamount=inputamount_txt.getText()+btn_4.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
     inputamount=inputamount_txt.getText()+btn_5.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
     inputamount=inputamount_txt.getText()+btn_6.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
     inputamount=inputamount_txt.getText()+btn_7.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
     inputamount=inputamount_txt.getText()+btn_0.getText();
     inputamount_txt.setText(inputamount);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       inputamount_txt.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_enter;
    private javax.swing.JButton db_back_btn;
    public javax.swing.JTextField inputamount_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
