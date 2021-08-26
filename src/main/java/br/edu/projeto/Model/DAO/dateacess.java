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
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
public class dateacess implements DAOClient {


EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
        

@Override
    public void adicionarClient(Client client) {
        /*Client cl = new Client();
        cl.setName("2222");
        cl.setCpf(111);
        cl.setEmail("Luft@hot");
        cl.setPassword("111");
        cl.setUserName("111");*/
        try{
             manager.getTransaction().begin();
             if(client.getId() == null){
                 manager.persist(client);
             }else{
                 manager.merge(client);

                 /*client = manager.merge(client);
                 manager.merge(client);*/
             }
             manager.getTransaction().commit();
        }catch (Exception e) {
			System.err.println(e);
			manager.getTransaction().rollback();
        }finally {
			factory.close();
		} 

        //
    }

    


@Override
    public void removerClient(Client cli, long id) {
        Client vendaFind = manager.find(Client.class, id);
        TypedQuery<Client> consulta = manager.createQuery("SELECT cli FROM Client cli", Client.class);
       
        List<Client> lista = consulta.getResultList();
        
         //JOptionPane.showMessageDialog(null, "lista : ");
        
        manager.getTransaction().begin();
        manager.remove(vendaFind);
        manager.getTransaction().commit();
        //factory.close();
        /*try {
            
            manager.getTransaction().begin();
            manager.remove(manager.find(cli.getName(), cli.getId()));
            manager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            
        } finally {
            factory.close();
        }   */
        //factory.close();
    }

    @Override
    public void atualizarClient(Client client) {
        manager.getTransaction().begin();
        //manager.remove(client.getId());
        manager.persist(client);
        manager.getTransaction().commit();
        
        //factory.close();
        /*manager.merge(client);
        manager.getTransaction().commit();*/

        //result.include("message", " ALTERADO");
        //result.redirectTo(this).lista(); 
        //factory.close();
    }

    @Override
    public void getClient(long id) {
        
       Query query = manager.createQuery("SELECT client FROM Client client");
            
        List<Client> lista =  query.getResultList();
           //JOptionPane.showMessageDialog(null, "usuario : "+   );
    }
    
    public void closed(){
        factory.close();
    }
    
   /* public List<Client> getAllClient() {
             //Query query = em.createQuery("SELECT client FROM projeto client");
            
            // List<Client> lista =  query.getResultList();
           //return lista;
    }*/
}

