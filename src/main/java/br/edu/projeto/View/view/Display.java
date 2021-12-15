package br.edu.projeto.View.view;

import br.edu.projeto.Model.DAO.AcessStock;
import br.edu.projeto.Model.DAO.Find;
import br.edu.projeto.Model.DAO.FindGeral;
import br.edu.projeto.Model.DAO.FindP;
import br.edu.projeto.Model.DAO.dateacess;
import br.edu.projeto.Model.DAO.dateacess2;
import br.edu.projeto.Model.DAO.salesave;
import br.edu.projeto.Model.Vo.Client;
import br.edu.projeto.Model.Vo.Logado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;







/**
 *
 * @author qwert
 */
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Display
     */
    public Display() {
        initComponents();
        
        Find fin = new Find();
        FindGeral fg = new FindGeral();
        
        for(Client cli :fin.findAll()){
            for(Logado log:fg.findLogado()){
                if(cli.getId() == log.getCode()){
                    //System.out.println("entrouuuuuuuuu");

                    Labelname.setText(cli.getName());
                    LabelUser.setText(cli.getUserName());
                    LabelPass.setText(cli.getPassword());
                    LabelEmail.setText(cli.getEmail());
                    LabelPhone.setText(String.valueOf(cli.getPhone()));
                    LabelCPF.setText(String.valueOf(cli.getCpf()));

                }
            }
        }   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
=======
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
        painelImagemFundo1 = new br.edu.projeto.View.view.PainelImagemFundo();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LabelCPF = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        Labelname = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LabelPhone = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

<<<<<<< HEAD
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelImagemFundo1.setImg(new ImageIcon("src/main/java/br/edu/projeto/View/img/menub.jpg"));

=======
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelImagemFundo1.setImg(new ImageIcon("src/main/java/br/edu/projeto/View/img/menub.jpg"));

>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UserName");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA DISPLAY");

        LabelPass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelPass.setForeground(new java.awt.Color(255, 255, 255));
        LabelPass.setText("jLabel7");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone");
<<<<<<< HEAD

        LabelCPF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        LabelCPF.setText("jLabel13");

        LabelName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelName.setForeground(new java.awt.Color(255, 255, 255));
        LabelName.setText("Name : ");

        Labelname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Labelname.setForeground(new java.awt.Color(255, 255, 255));
        Labelname.setText("jLabel2");

        LabelUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelUser.setForeground(new java.awt.Color(255, 255, 255));
        LabelUser.setText("jLabel6");

=======

        LabelCPF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        LabelCPF.setText("jLabel13");

        LabelName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelName.setForeground(new java.awt.Color(255, 255, 255));
        LabelName.setText("Name : ");

        Labelname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Labelname.setForeground(new java.awt.Color(255, 255, 255));
        Labelname.setText("jLabel2");

        LabelUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelUser.setForeground(new java.awt.Color(255, 255, 255));
        LabelUser.setText("jLabel6");

>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
        LabelEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmail.setText("jLabel11");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CPF");

        LabelPhone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelPhone.setForeground(new java.awt.Color(255, 255, 255));
        LabelPhone.setText("jLabel12");

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(187, Short.MAX_VALUE)
=======
                .addContainerGap(129, Short.MAX_VALUE)
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelName)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(38, 38, 38)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                            .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(LabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(LabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Labelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))
=======
                            .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Labelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(LabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168))
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(139, 139, 139))))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(Labelname))
                .addGap(21, 21, 21)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LabelUser))
                .addGap(18, 18, 18)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPass)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(LabelEmail)
                        .addGap(53, 53, 53)
                        .addComponent(LabelCPF))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(LabelPhone))))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(54, 54, 54));
        jMenuBar1.setForeground(new java.awt.Color(54, 54, 54));
        jMenuBar1.setToolTipText("");

        jMenu1.setText("                                   ");
        jMenuBar1.add(jMenu1);
<<<<<<< HEAD

        jMenu2.setForeground(new java.awt.Color(240, 240, 240));
        jMenu2.setText("Menu");
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(240, 240, 240));
        jMenu3.setText("Change");
        jMenuBar1.add(jMenu3);

=======

        jMenu2.setForeground(new java.awt.Color(240, 240, 240));
        jMenu2.setText("Menu");
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(240, 240, 240));
        jMenu3.setText("Change");
        jMenuBar1.add(jMenu3);

>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
        jMenu4.setForeground(new java.awt.Color(240, 240, 240));
        jMenu4.setText("Products");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("                                                           ");
        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(240, 240, 240));
        jMenu6.setText("LOGOUT");
        jMenuBar1.add(jMenu6);

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCPF;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel LabelPhone;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JLabel Labelname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
<<<<<<< HEAD
=======
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
>>>>>>> 8ade0a71884f860c9494c2dd1e6010aee14119eb
    private br.edu.projeto.View.view.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables
}
