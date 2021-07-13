/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;


import br.edu.projeto.Model.Vo.Product;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author qwert
 */ 
public interface DAOProduct {
     public void adicionarProduct(Product pro);

         public Product getProduct(int id);
        

         public void removerProduct(Product pro, long id);

         public void atualizarProduct(Product pro);
         
         public void closed();

         //public ArrayList<Product getAllProduct();
}
