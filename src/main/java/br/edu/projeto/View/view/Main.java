/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.View.view;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author qwert
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        painelImagemFundo1 = new br.edu.projeto.View.view.PainelImagemFundo();
        EMP = new javax.swing.JButton();
        CLi = new javax.swing.JButton();
        JINFO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelImagemFundo1.setImg(new ImageIcon("src/main/java/br/edu/projeto/View/img/menub.jpg"));

<<<<<<< HEAD
=======
        EMP.setBackground(new java.awt.Color(255, 255, 255));
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
        EMP.setText("EMPLOYEE");
        EMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMP(evt);
            }
        });

        CLi.setText("CLIENT");
        CLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLIENT(evt);
            }
        });

        JINFO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JINFO.setForeground(new java.awt.Color(255, 255, 255));
        JINFO.setText("LOG IN HOW?");

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CLi, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(EMP, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(JINFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(146, 146, 146))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(JINFO)
                .addGap(49, 49, 49)
                .addComponent(EMP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(CLi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EMP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMP
        MenuTwo men2 = new MenuTwo();
        men2.setSize(500,400);
        men2.getContentPane().setBackground(Color.black);
        men2.setVisible(true);
        dispose();
    }//GEN-LAST:event_EMP

    private void CLIENT(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLIENT
        MenuOne men = new MenuOne();
        men.setSize(500,400);
        men.getContentPane().setBackground(Color.black);
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_CLIENT

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLi;
    private javax.swing.JButton EMP;
    private javax.swing.JLabel JINFO;
    private br.edu.projeto.View.view.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables
}
