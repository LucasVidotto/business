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
public class Pay implements DAOPay{
    
     salesave sv = new salesave();
     
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    @Override
    public void ToPay(Long id) {
        
        Query loga = manager.createQuery("select logado from Logado logado");

        List<Logado> resultList3 = loga.getResultList();
        
        Query sale = manager.createQuery("select sale from Sale sale");

        List<Sale> resultList = sale.getResultList();
        for(Logado log: resultList3){
            for(Sale sal: resultList){
                if(log.getCode() == id){
                    
                    sv.removerSale(sal, sal.getCod());
                }
            
            }
    
        }

    }
          
}


