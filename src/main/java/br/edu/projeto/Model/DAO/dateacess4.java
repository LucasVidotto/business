/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**W
 *
 * @author qwert
 */
public class dateacess4 implements DAOChange{
    
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    @Override
    public void adicionarChange(Change cg) {
        manager.getTransaction().begin();
        manager.persist(cg);
        manager.getTransaction().commit();
        //factory.close();
    }

    @Override
    public void getChange(long id) {
    }

    @Override
    public void removerChange(Change cg, long id) {
        manager.getTransaction().begin();
        manager.remove(cg);
        manager.getTransaction().commit();
        //factory.close();
    }

    @Override
    public void atualizarChange(Change cg) {
    }

    @Override
    public void closed() {
        factory.close();
    }
    
}
