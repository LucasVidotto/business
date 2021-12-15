/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;


import br.edu.projeto.Model.Vo.Client;
import br.edu.projeto.Model.Vo.Logado;
import br.edu.projeto.Model.Vo.Product;
import br.edu.projeto.Model.Vo.Sale;
import br.edu.projeto.Model.Vo.Stock;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
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
       Sale sale = new Sale();
       salesave sv = new salesave();
       
       int num = 0;
       
       Query loga = manager.createQuery("select logado from Logado logado");

      List<Logado> resultList3 = loga.getResultList();
      
      Query clien = manager.createQuery("select client from Client client");

      List<Client> resultList4 = clien.getResultList();
      
      for(Logado log: resultList3){
          for(Client cli:resultList4){
          if(cli.getId() == log.getCode()){
              sale.setCli(cli);
          }
          
        }
          
      }
       
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
                    if(sto.getQuantity() >= quanti){
                        st.setName(p.getName());
                        st.setDescription(p.getDescription());
                        st.setPrice(p.getPrice());
                        st.setProduct(p);
                        st.setQuantity(sto.getQuantity() - quanti);

                        acss.removerStock(sto, sto.getCode());
                        dt2.removerProduct(pro, pro.getId());
                        num = 1;
                    }else{
                        //JOptionPane.showMessageDialog(null,"sem essa quangtidade no estoque");
                        JOptionPane.showMessageDialog(
                        null, "ErrorMsg", "Failure", JOptionPane.ERROR_MESSAGE);
                        num = 2;
                    } 
                    
                }else{
                    num = 2;
                }
                if(num == 1){
                    break;
                }
            }
            
            
            dt2.adicionarProduct(p);
            acss.adicionarStock(st);
            
            sale.setStock(st);
            sale.setTotal(price * quanti);
            sv.adicionar(sale);
         
            
        }else{
            System.out.println("não entrou");
            
        }
        
      }

      return num;
    }
    public String FindProduct(double price){
        
        String aux = "";
        
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
        Query q = manager.createQuery("select product from Product product");

        List<Product> resultList = q.getResultList();

        for (Product pro : resultList) {

            if(pro.getPrice() == (price)){
              aux = pro.getDescription();
            }else{
                System.out.println("Error");
            }
        }
           
        return aux;
    }
    
}
