/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.View.view;

import br.edu.projeto.Model.DAO.AcessStock;
import br.edu.projeto.Model.DAO.dateacess;
import br.edu.projeto.Model.DAO.dateacess2;
import br.edu.projeto.Model.DAO.salesave;
import javax.swing.ImageIcon;
import br.edu.projeto.Model.Vo.Product;
import br.edu.projeto.Model.Vo.Sale;
import br.edu.projeto.Model.Vo.Stock;

/**
 *
 * @author qwert
 */
public class NewPro extends javax.swing.JFrame {

    /**
     * Creates new form NewPro
     */
    public NewPro() {
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

        jTextField1 = new javax.swing.JTextField();
        painelImagemFundo1 = new br.edu.projeto.View.view.PainelImagemFundo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JName = new javax.swing.JTextField();
        Jdiscretion = new javax.swing.JTextField();
        JPrice = new javax.swing.JTextField();
        Jquanti = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelImagemFundo1.setImg(new ImageIcon("src/main/java/br/edu/projeto/View/img/menub.jpg"));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descri????o");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pre??o");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade");

        JName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JName.setText("JName");
        JName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNameActionPerformed(evt);
            }
        });

        Jdiscretion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Jdiscretion.setText("Descri????o");

        JPrice.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JPrice.setText("Price");

        Jquanti.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Jquanti.setText("Quantidade");

        Confirm.setBackground(new java.awt.Color(255, 255, 255));
        Confirm.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Confirm.setText("CONFIRM");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm(evt);
            }
        });

        Clean.setBackground(new java.awt.Color(255, 255, 255));
        Clean.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Clean.setText("CLEAN");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clean(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Register Product");

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Confirm)
                                .addGap(49, 49, 49)
                                .addComponent(Clean))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))
                        .addGap(67, 67, 67))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jdiscretion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jquanti, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(Jdiscretion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57))
                            .addComponent(Jquanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(52, 52, 52))))
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)))
                .addGap(26, 26, 26)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clean)
                    .addComponent(Confirm))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Menu.setText("File");
        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Confirm)
                        .addGap(106, 106, 106)
                        .addComponent(Clean))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jdiscretion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jquanti, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Jdiscretion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(32, 32, 32)
                                        .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4))
                    .addComponent(Jquanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clean)
                    .addComponent(Confirm))
                .addGap(31, 31, 31))
=======
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNameActionPerformed
        JName.setText("your name");
    }//GEN-LAST:event_JNameActionPerformed

    private void Confirm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm
        Product pd = new Product();
        Stock st = new Stock();
        //Sale sale = new Sale();
        
        pd.setName(JName.getText());
        pd.setDescription(Jdiscretion.getText());
        pd.setPrice(Double.valueOf(JPrice.getText()));
        
        st.setDescription((Jdiscretion.getText()));
        st.setName(JName.getText());
        st.setPrice(Double.valueOf(JPrice.getText()));
        st.setQuantity(Integer.valueOf(Jquanti.getText()));
        st.setProduct(pd);
        
        dateacess2 dc = new dateacess2();
        dc.adicionarProduct(pd);
        
        AcessStock ast = new AcessStock();
        ast.adicionarStock(st);
        
        

    }//GEN-LAST:event_Confirm

    private void Clean(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clean
        JName.setText("");
        Jdiscretion.setText("");
        JPrice.setText("");
        Jquanti.setText("");
        
    }//GEN-LAST:event_Clean

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
            java.util.logging.Logger.getLogger(NewPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clean;
    private javax.swing.JButton Confirm;
    private javax.swing.JTextField JName;
    private javax.swing.JTextField JPrice;
    private javax.swing.JTextField Jdiscretion;
    private javax.swing.JTextField Jquanti;
<<<<<<< HEAD
=======
    private javax.swing.JMenu Menu;
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
<<<<<<< HEAD
=======
    private br.edu.projeto.View.view.PainelImagemFundo painelImagemFundo1;
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
    // End of variables declaration//GEN-END:variables
}
