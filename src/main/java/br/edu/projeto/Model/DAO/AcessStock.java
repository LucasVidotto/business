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
import javax.swing.JOptionPane;

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
        try{
             manager.getTransaction().begin();
             if(sto.getCode()== null){
                 manager.persist(sto);
             }else{
                 manager.merge(sto);

                 /*client = manager.merge(client);
                 manager.merge(client);*/
             }
             manager.getTransaction().commit();
        }catch (Exception e) {
			System.err.println(e);
			manager.getTransaction().rollback();
        }finally {
			//factory.close();
		} 
    }

    

    @Override
    public void removerStock(Stock sto, long id) {
        Stock profind = manager.find(Stock.class, id);
        TypedQuery<Stock> consulta = manager.createQuery("SELECT sto FROM Stock sto", Stock.class);
       
        List<Stock> lista = consulta.getResultList();
        
         //JOptionPane.showMessageDialog(null, "lista : ");
        
        manager.getTransaction().begin();
        manager.remove(profind);
        manager.getTransaction().commit();
        
        
        //factory.close();
        
    }

    @Override
    public void atualizarStock(Stock pro) {
        /*manager.getTransaction().begin();
        pro = manager.merge(pro);
        manager.getTransaction().commit();*/
    }

    @Override
    public void closed() {
        factory.close();
    }
    
}
