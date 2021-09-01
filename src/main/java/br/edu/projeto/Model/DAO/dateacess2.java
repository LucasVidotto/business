/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;


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
public class dateacess2 implements DAOProduct{
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
        
@Override
    public void adicionarProduct(Product pro) {
        
        
        manager.getTransaction().begin();
        manager.persist(pro);
        manager.getTransaction().commit();
        
        //factory.close();
        
        //factory.close();
    }

    

@Override
    public void removerProduct(Product pro, long id) {
        Product ProFind = manager.find(Product.class, id);
        TypedQuery<Product> consulta = manager.createQuery("SELECT pro FROM Product pro", Product.class);
       
        List<Product> lista = consulta.getResultList();
        
         //JOptionPane.showMessageDialog(null, "lista : ");
        
        manager.getTransaction().begin();
        manager.remove(ProFind);
        manager.getTransaction().commit();
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
        //factory.close();
    }

    @Override
    public void atualizarProduct(Product pro) {
        manager.getTransaction().begin();
        manager.persist(pro);
        manager.getTransaction().commit();
        
        //factory.close();
        /*manager.merge(client);
        manager.getTransaction().commit();*/

        //result.include("message", " ALTERADO");
        //result.redirectTo(this).lista(); 
        //factory.close();
    }

    @Override
    public Product getProduct(int id){
        return null;
    }
    
    @Override
    public void closed(){
        factory.close();
    }
    
   /* public List<Client> getAllClient() {
             //Query query = em.createQuery("SELECT client FROM projeto client");
            
            // List<Client> lista =  query.getResultList();
           //return lista;
    }*/
}

