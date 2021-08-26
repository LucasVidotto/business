/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Sale;
import br.edu.projeto.Model.Vo.Stock;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author qwert
 */
public class salesave {
    
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        

    public void adicionar(Sale sale) {
        manager.getTransaction().begin();
        manager.persist(sale);
        manager.getTransaction().commit();
        
        //factory.close();
    }
    
    public void removerSale(Sale pro, long id) {
        Sale profind = manager.find(Sale.class, id);
        TypedQuery<Sale> consulta = manager.createQuery("SELECT pro FROM Sale pro", Sale.class);
       
        List<Sale> lista = consulta.getResultList();
        
         //JOptionPane.showMessageDialog(null, "lista : ");
        
        manager.getTransaction().begin();
        manager.remove(profind);
        manager.getTransaction().commit();
        
        
        //factory.close();
        
    }
}
