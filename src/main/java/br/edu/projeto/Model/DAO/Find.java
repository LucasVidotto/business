/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author qwert
 */
public class Find {
    
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    public Client  findById(long id){
        
        Client cli = null;
        
        try{
            cli =  manager.find(Client.class, id);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //manager.close();
        }
        return cli;
        
        
    }
    
    
    public List<Client> findAll(){
        
        List<Client> client = null;
        
        try{
           client =  manager.createQuery("from Client c").getResultList();
        }catch(Exception e){
            System.out.println(e);
        }finally{
           //manager.close();
        }


        return client;
    }
    
}
