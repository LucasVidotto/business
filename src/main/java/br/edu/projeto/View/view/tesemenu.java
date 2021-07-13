
package br.edu.projeto.View.view;


import br.edu.projeto.Model.DAO.FindP;
import br.edu.projeto.Model.DAO.dateacess;
import br.edu.projeto.Model.DAO.dateacess2;

import br.edu.projeto.Model.Vo.Client;
import br.edu.projeto.Model.Vo.Product;
import br.edu.pr.projeto.modelo.conexao.ConexaoHibernate;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author qwert
 */
public class tesemenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Menu m = new Menu();
        Products pd = new Products();
        pd.setSize(420,400);
        //frame.setSize(tamX, tamY);
        pd.setVisible(true);
        //m.setVisible(true);
        /*InsereClient in = new InsereClient();
        in.adiciona();*/
        /*logar log = new logar();
        log.setSize(400,380);
        log.setVisible(true);*/
        
        /*Menu menu = new Menu();
        menu.setSize(428,400);
        menu.getContentPane().setBackground(Color.RED);
        menu.setVisible(true);*/
        
        /*dateacess date = new dateacess();
        Client cli = new Client();
        
        date.removerClient(cli, 5);*/
        
        //date.adicionarClient(cli);*/
        
        /*Products pro = new Products();
        pro.setSize(500,500);
        pro.setVisible(true);*/
        
        /*dateacess2 dt = new dateacess2();
        FindP find = new FindP();
        
        for(Product p: find.findAll()){
            if( p.getId() == 1){
                //p.getQuantidade() >= quantidade
                JOptionPane.showMessageDialog(null, "entrou");
               
                 dt.removerProduct(p, 1);
            }
           
        }
        dt.closed();*/
        
        /*teste tes = new teste();
        
        /*Alterar alt = new Alterar();
        alt.setVisible(true);*/
        /*register reg = new register();
        reg.setVisible(true);*/
        
       MenuOne men = new MenuOne();
        men.setSize(500,400);
        men.getContentPane().setBackground(Color.BLACK);
        men.setVisible(true);
        
        
    }
    
}
