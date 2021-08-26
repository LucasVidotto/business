/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;


import br.edu.projeto.Model.Vo.Product;
import br.edu.projeto.Model.Vo.Stock;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author qwert
 */
public class BuyItem implements DAOBuy{
    
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    @Override
    public int FindProduct(double price,int quanti){
       Product p = new Product();
       Stock st = new Stock();
       int num = 0;
       
      Query q = manager.createQuery("select product from Product product");

      List<Product> resultList = q.getResultList();
      

      
      for (Product pro : resultList) {

       
        if(pro.getPrice() == (price)){

            p.setName(pro.getName());
            p.setPrice(pro.getPrice());
            p.setDescription(pro.getDescription());
            
            dateacess2 dt2 = new dateacess2();
            AcessStock acss = new AcessStock();
            
            Query q2 = manager.createQuery("select stock from Stock stock");

            List<Stock> resultList2 = q2.getResultList();
            
            for(Stock sto: resultList2){
                if(sto.getPrice() == price){
                    st.setName(p.getName());
                    st.setDescription(p.getDescription());
                    st.setPrice(p.getPrice());
                    st.setProduct(p);
                    st.setQuantity(sto.getQuantity() - quanti);
                    
                    acss.removerStock(sto, sto.getCode());
                    dt2.removerProduct(pro, pro.getId());
                    
                    
                    
                    num = 1;
                }else{
                    num = 2;
                }
            }
            
            /*if(p.getName() != null){
                dt2.adicionarProduct(p);
                acss.adicionarStock(st);
            }else{
                System.out.println("variavel nula, nao existe peristencia no banco");
            }*/
            dt2.adicionarProduct(p);
            acss.adicionarStock(st);
            
            
            
        }else{
            System.out.println("não entrou");
            p = null;
        }
        
      }

      return num;
    } 
}
