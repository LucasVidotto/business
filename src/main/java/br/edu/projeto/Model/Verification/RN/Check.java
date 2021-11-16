/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.Verification.RN;

import br.edu.projeto.Model.DAO.Find;
import br.edu.projeto.Model.Vo.Client;
import br.edu.projeto.Model.Vo.Product;
import br.edu.projeto.View.view.Display;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author qwert
 */
public class Check {//Regra de negócio
    int number = 3;
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
    public int CheckUser(String user){
        Find find = new Find();
        
        
        for(Client cli:find.findAll()){
            JOptionPane.showMessageDialog(null,"nome : "+cli.getId());
                if(cli.getName().equals(user)){
                    
                    number = 0;
                    //JOptionPane.showConfirmDialog(null,"Já exite esse User Name");
                    break;
                    
                }else{
                    number = 1;
     
                }
        }
        return number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
