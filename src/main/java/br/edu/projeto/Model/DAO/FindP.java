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

/**
 *
 * @author qwert
 */
public class FindP {
    
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    public Product  findById(int price){
        
        Product pro = null;
        
        try{
            pro =  manager.find(Product.class, price);
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
           pro =  manager.createQuery("Select p from Product p").getResultList();
            System.out.println(pro);

            
        }catch(Exception e){
            System.out.println(e);
        }finally{
           //manager.close();
        }


        return pro;
    }
    public Product FindProduct(double price){
       Product p = new Product();
       
       
      Query q = manager.createQuery("select product from Product product");

      List<Product> resultList = q.getResultList();
      

      
      for (Product next : resultList) {

       
        if(next.getPrice() == (price)){

            p.setName(next.getName());
            p.setPrice(next.getPrice());
            p.setDescription(next.getDescription());
        }else{
            System.out.println("não entrou");
            p = null;
        }
      }

      return p;
    } 

}
