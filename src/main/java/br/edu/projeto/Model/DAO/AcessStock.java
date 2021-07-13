/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;


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
public class AcessStock implements DAOStock{
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
    @Override
    public void adicionarStock(Stock sto) {
        manager.getTransaction().begin();
        manager.persist(sto);
        manager.getTransaction().commit();
        factory.close();
    }

    

    @Override
    public void removerStock(Stock pro, long id) {
        Stock profind = manager.find(Stock.class, id);
        TypedQuery<Stock> consulta = manager.createQuery("SELECT pro FROM Stock pro", Stock.class);
       
        List<Stock> lista = consulta.getResultList();
        
         //JOptionPane.showMessageDialog(null, "lista : ");
        
        manager.getTransaction().begin();
        manager.remove(profind);
        manager.getTransaction().commit();
        //factory.close();
        
    }

    @Override
    public void atualizarStock(Stock pro) {

    }

    @Override
    public void closed() {
        factory.close();
    }
    
}
