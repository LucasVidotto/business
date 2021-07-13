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

/**
 *
 * @author qwert
 */
public class FindP {
    
EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    public Product  findById(long id){
        
        Product pro = null;
        
        try{
            pro =  manager.find(Product.class, id);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //manager.close();
        }
        return pro;
        
        }
    
    
    public List<Product> findAll(){
        StringBuilder sb = new StringBuilder();
        List<Product> pro = null;
        
        try{
           pro =  manager.createQuery("from Product p").getResultList();
            System.out.println(pro);
            
            
            /*sb.append(" select p");
            sb.append(" From Product p");
            System.out.println(sb);
            pro = manager.;*/
            
        }catch(Exception e){
            System.out.println(e);
        }finally{
           //manager.close();
        }


        return pro;
    }
}
