/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static java.lang.Thread.sleep;
/**
 *
 * @author Melvin Mathew
 */

public class NewJFrame extends javax.swing.JFrame {
int b=0,i=0,sc=1,n=1,a=1;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        e111 = new javax.swing.JLabel();
        e222 = new javax.swing.JLabel();
        e22 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        e33 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e11 = new javax.swing.JLabel();
        e333 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(e111, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 11, 15));
        getContentPane().add(e222, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 11, 15));
        getContentPane().add(e22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 11, 15));
        getContentPane().add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 11, 15));

        score.setText("0");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 20, 20));
        getContentPane().add(i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 62));

        i1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melvin Mathew\\Desktop\\pp.png")); // NOI18N
        getContentPane().add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        getContentPane().add(e33, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 11, 15));
        getContentPane().add(i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 64, 62));

        jLabel2.setText("Score");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, -1));

        e1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melvin Mathew\\Desktop\\pa.png")); // NOI18N
        getContentPane().add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 10, 20));
        getContentPane().add(e11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 11, 15));
        getContentPane().add(e333, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 11, 15));
        getContentPane().add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 11, 15));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/Melvin Mathew/Desktop/a.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel1.setText(" ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 308, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      switch (i) {
         case 0:
             if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {i=1;
             Icon a=i1.getIcon();
             i2.setIcon(a);
             i1.setIcon(new ImageIcon(""));
             }     
             else if(evt.getKeyCode() == KeyEvent.VK_LEFT)  {i=2;
             Icon a=i1.getIcon();
             i3.setIcon(a);
             i1.setIcon(new ImageIcon(""));
             }break;
         case 1:
             if(evt.getKeyCode() == KeyEvent.VK_RIGHT){i=2;
             Icon a=i2.getIcon();
             i3.setIcon(a);
             i2.setIcon(new ImageIcon(""));
             }
             else if(evt.getKeyCode() == KeyEvent.VK_LEFT) {i=0;
             Icon a=i2.getIcon();
             i1.setIcon(a);
             i2.setIcon(new ImageIcon(""));
             
             }break;
         case 2:
             if(evt.getKeyCode() == KeyEvent.VK_RIGHT){i=0;
             Icon a=i3.getIcon();
             i1.setIcon(a);
             i3.setIcon(new ImageIcon(""));
             }
             else if(evt.getKeyCode() == KeyEvent.VK_LEFT) {i=1;
             Icon a=i3.getIcon();
             i2.setIcon(a);
             i3.setIcon(new ImageIcon(""));
             
             }break;
         default:
             break;
     }
   
     if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==8){
     e1.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=0;
     e333.setIcon(new ImageIcon(""));
     
     }
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==0){
     e11.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=1;
     e1.setIcon(new ImageIcon(""));
     e1.setIcon(new ImageIcon(""));}
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==1){e11.setIcon(new ImageIcon(""));
     e111.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=2; 
     if(i!=0){
         e111.setIcon(new ImageIcon(""));
         i1.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\b.png"));
     }
     else if(i==0){
         score.setText((sc++) + "");
     }}
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==2){
     e2.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=3;
     e111.setIcon(new ImageIcon(""));}
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==3){
     e22.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=4;
     e2.setIcon(new ImageIcon(""));}
     
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==4){e22.setIcon(new ImageIcon(""));
     e222.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=5; 
     if(i!=1){
         e222.setIcon(new ImageIcon(""));
         
         i2.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\b.png"));
     }
     else if(i==1){
         score.setText((sc++) + "");
     }}
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==5){
     e3.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=6;
     e222.setIcon(new ImageIcon(""));}
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==6){
     e33.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=7;
     e3.setIcon(new ImageIcon(""));}
     
     else if(evt.getKeyCode() == KeyEvent.VK_CONTROL && b==7){e33.setIcon(new ImageIcon(""));
     e333.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\pa.png"));
     b=8; 
     if(i!=2){
         e333.setIcon(new ImageIcon(""));
         i3.setIcon(new ImageIcon("C:\\Users\\Melvin Mathew\\Documents\\NetBeansProjects\\JavaApplication5\\src\\javaapplication5\\b.png"));
     }
     else if(i==2){
         score.setText((sc++ ) + "");
     }}
     
     
     
         
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e11;
    private javax.swing.JLabel e111;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e22;
    private javax.swing.JLabel e222;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e33;
    private javax.swing.JLabel e333;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}