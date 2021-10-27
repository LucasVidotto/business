/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Client;
import br.edu.projeto.Model.Vo.Logado;
import br.edu.projeto.Model.Vo.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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
    
    public Long FindLog( ){
      Long id = null;
      Query cli = manager.createQuery("select client from Client client");

      List<Client> resultList = cli.getResultList();
      
      Query log = manager.createQuery("select logado from Logado logado");

      List<Logado> resultList2 = log.getResultList();

      for(Logado lg: resultList2){
          for(Client cl: resultList){
              
               if(lg.getCode()== cl.getId()){
                    id = cl.getId();
                    
                }
          }
      }
      
      return id;
    }
    
    public void closed(){
        factory.close();
    }
    
}
