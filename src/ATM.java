
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jokhi
 */
public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form ATM
     */
    
     
     Balance b=new Balance();
    Deposit  obj=new Deposit( this,b);
   withdrawal w=new withdrawal(this,b);
    

    public ATM() {
        initComponents();
        imageScale();
    }
    
    
    public void imageScale(){
    
    ImageIcon wicon=new ImageIcon("C:\\Users\\jokhi\\Desktop\\internship projects\\task2\\src\\withdrawal.jpg");
    Image wimg=wicon.getImage();
    Image wimagescale=wimg.getScaledInstance(100,100  , Image.SCALE_SMOOTH);
    ImageIcon wscaledicone=new ImageIcon(wimagescale);
    withdraw_btn.setHorizontalTextPosition(JButton.CENTER);
    withdraw_btn.setVerticalTextPosition(JButton.TOP);
    withdraw_btn.setIconTextGap(5);
    withdraw_btn.setIcon(wscaledicone);
    
    
    ImageIcon dicon=new ImageIcon("C:\\Users\\jokhi\\Desktop\\internship projects\\task2\\src\\dep.jpg");
    Image dimg=dicon.getImage();
    Image dimagescale=dimg.getScaledInstance(100,100 , Image.SCALE_SMOOTH);
    ImageIcon dscaledicone=new ImageIcon(dimagescale);
    deposit_btn.setHorizontalTextPosition(JButton.CENTER);
    deposit_btn.setVerticalTextPosition(JButton.TOP);
    deposit_btn.setIconTextGap(5);
    deposit_btn.setIcon(dscaledicone);
   
    
    ImageIcon bicon=new ImageIcon("C:\\Users\\jokhi\\Desktop\\internship projects\\task2\\src\\balance.jpg");
    Image bimg=bicon.getImage();
    Image bimagescale=bimg.getScaledInstance(100,100 , Image.SCALE_SMOOTH);
    ImageIcon bscaledicone=new ImageIcon(bimagescale);
    balance_btn.setHorizontalTextPosition(JButton.CENTER);
    balance_btn.setVerticalTextPosition(JButton.TOP);
    balance_btn.setIconTextGap(5);
    balance_btn.setIcon(bscaledicone);
     
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
        jLabel2 = new javax.swing.JLabel();
        balance_btn = new javax.swing.JButton();
        withdraw_btn = new javax.swing.JButton();
        deposit_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 5, 186));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please enter your amount ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 5, 186));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please select from below ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 530, 60));

        balance_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        balance_btn.setForeground(new java.awt.Color(5, 5, 186));
        balance_btn.setText("Check Balance");
        balance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_btnActionPerformed(evt);
            }
        });
        getContentPane().add(balance_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 220, 190));

        withdraw_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        withdraw_btn.setForeground(new java.awt.Color(5, 5, 186));
        withdraw_btn.setText("Withdrawal");
        withdraw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btnActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 220, 190));

        deposit_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        deposit_btn.setForeground(new java.awt.Color(5, 5, 186));
        deposit_btn.setText("Deposit");
        deposit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(deposit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 220, 190));

        exit_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(5, 5, 186));
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 150, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deposit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btnActionPerformed

        obj.setVisible(true);
        this.setVisible(false);
                       
    }//GEN-LAST:event_deposit_btnActionPerformed

    private void withdraw_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_btnActionPerformed

        w.setVisible(true);
        this.setVisible(false);       
        
    }//GEN-LAST:event_withdraw_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_exit_btnActionPerformed

    private void balance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance_btnActionPerformed
        b.accountbalance(this);
    }//GEN-LAST:event_balance_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balance_btn;
    private javax.swing.JButton deposit_btn;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton withdraw_btn;
    // End of variables declaration//GEN-END:variables
}
