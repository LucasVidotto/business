/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Client;
import br.edu.projeto.Model.Vo.Logado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author qwert
 */
public class AcessoLogado implements DAOLogado{
    
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    @Override
    public void Logar(Logado log) {
        manager.getTransaction().begin();
        manager.persist(log);
        manager.getTransaction().commit();
        //factory.close();
    }

    @Override
    public void Deslogar(Logado log, long id) {
        Logado findlog = manager.find(Logado.class, id);
        TypedQuery<Logado> consulta = manager.createQuery("SELECT log FROM Logado log", Logado.class);
       
        List<Logado> lista = consulta.getResultList();
        //factory.close();
        
         //JOptionPane.showMessageDialog(null, "lista : ");
        
        manager.getTransaction().begin();
        manager.remove(findlog);
        manager.getTransaction().commit();
        //factory.close();
    }
    
    
    
    public void closed(){
        factory.close();
    }
    
}
