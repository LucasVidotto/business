/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Client;
import br.edu.projeto.Model.Vo.Employee;
import br.edu.projeto.Model.Vo.Logado;
import br.edu.projeto.Model.Vo.Sale;
import br.edu.projeto.Model.Vo.Stock;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author qwert
 */
public class FindGeral {
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
    
    
    public List<Logado> findLogado(){
        
        List<Logado> log = null;
        
        try{
           log =  manager.createQuery("from Logado l").getResultList();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //manager.close();
        }


        return log;
    }
    
    public List<Sale> findSale(){
        
        List<Sale> sale = null;
        
        try{
           sale =  manager.createQuery("from Sale s").getResultList();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //manager.close();
        }


        return sale;
    }
    
     public List<Stock> findStock(){
        
        List<Stock> stock = null;
        
        try{
           stock =  manager.createQuery("from Stock st").getResultList();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //manager.close();
        }


        return stock;
    }
     
     public List<Employee> findEmp(){
         List<Employee> emp = null;
        
        try{
           emp =  manager.createQuery("from Employee st").getResultList();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //manager.close();
        }


        return emp;
     }
}
