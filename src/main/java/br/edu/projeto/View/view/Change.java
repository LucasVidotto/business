package br.edu.projeto.View.view;






import br.edu.projeto.Model.DAO.Find;
import br.edu.projeto.Model.DAO.dateacess;
import br.edu.projeto.Model.Vo.Client;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class Change extends javax.swing.JFrame {

    /**
     * Creates new form Alterar
     */
    public Change() {
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
        jLabel1 = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        OldPass = new javax.swing.JPasswordField();
        JNewP = new javax.swing.JLabel();
        NewPass = new javax.swing.JPasswordField();
        JconfirmP = new javax.swing.JLabel();
        ConfirmPass = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MeuBack = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelImagemFundo1.setImg(new ImageIcon("src/main/java/br/edu/projeto/View/img/menub.jpg"));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHANGE DATA");

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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Old password");

        JNewP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JNewP.setForeground(new java.awt.Color(255, 255, 255));
        JNewP.setText("New Password");

        JconfirmP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JconfirmP.setForeground(new java.awt.Color(255, 255, 255));
        JconfirmP.setText("Confirme Password");

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JNewP)
                                    .addComponent(jLabel5)))
                            .addComponent(JconfirmP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
            .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                    .addGap(189, 189, 189)
                    .addComponent(jLabel1)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(JNewP)
                        .addGap(35, 35, 35)
                        .addComponent(JconfirmP))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel1)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setToolTipText("");

        MeuBack.setBackground(new java.awt.Color(0, 0, 0));
        MeuBack.setForeground(new java.awt.Color(255, 255, 255));
        MeuBack.setText("<=");
        MeuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeuBackActionPerformed(evt);
            }
        });

        jMenuItem1.setText("<=");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenu(evt);
            }
        });
        MeuBack.add(jMenuItem1);

        jMenuBar1.add(MeuBack);

        setJMenuBar(jMenuBar1);

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

    private void Confirm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm
        // TODO add your handling code here
        dateacess dt = new dateacess();
        Find find = new Find(); 
        String aux = "";
        String senha = "";
        String name ="",userName ="",email ="";
        long idd = 0;
        int cpf = 0,phone =0;
        senha = new String(OldPass.getPassword());
        
        for(Client c: find.findAll()){
            if(senha.equals(c.getPassword())){
                aux = c.getPassword();
                name = c.getName();
                userName = c.getUserName();
                email = c.getEmail();
                cpf = c.getCpf();
                phone = c.getPhone();
                idd = c.getId();
                
                //dt.removerClient(c, c.getId());
                
            }
           // System.out.println("aux : "+c.getPassword());
        }
        
        
        if(aux.equals(senha)){
            
            String neww = "";
            neww = new String(NewPass.getPassword());
            Client cl = new Client();
            cl.setPassword(neww);
            cl.setCpf(cpf);
            cl.setName(name);
            cl.setEmail(email);
            cl.setPhone(phone);
            cl.setUserName(userName);
            cl.setId(idd);
            
            
            dt.adicionarClient(cl);
            JOptionPane.showMessageDialog(null, "Alterado");
        }else{
            JOptionPane.showMessageDialog(null,"A senha est?? incorreta");
       }
        
        
       // if((jPasswordField1.getPassword().equals(cli.getPassword())) ){
            
            /*if(jPasswordField2.getText().equals(jPasswordField3.getText())){
               JOptionPane.showMessageDialog(null,"Senha Alterada com Sucesso");
            
            }else{
                JOptionPane.showMessageDialog(null,"As senhas n??o s??o compativeis");
            }*/
            
        //}else {
        //       JOptionPane.showInternalMessageDialog(null, "Senha Invalida!"); 

       // }
        
       // dt.closed();
    }//GEN-LAST:event_Confirm
    
    private void Clean(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clean
        
    }//GEN-LAST:event_Clean

    private void MeuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeuBackActionPerformed

    }//GEN-LAST:event_MeuBackActionPerformed

    private void BackMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenu
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackMenu

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
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clean;
    private javax.swing.JButton Confirm;
    private javax.swing.JPasswordField ConfirmPass;
    private javax.swing.JLabel JNewP;
    private javax.swing.JLabel JconfirmP;
    private javax.swing.JMenu MeuBack;
    private javax.swing.JPasswordField NewPass;
    private javax.swing.JPasswordField OldPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private br.edu.projeto.View.view.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables
}
