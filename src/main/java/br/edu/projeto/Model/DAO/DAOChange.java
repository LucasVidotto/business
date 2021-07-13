/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;


import javafx.collections.ListChangeListener.Change;

/**
 *
 * @author qwert
 */
public interface DAOChange {
    
        public void adicionarChange(Change cg);

         public void getChange(long id);
        

         public void removerChange(Change cg, long id);

         public void atualizarChange(Change cg);
         
         public void closed();

         //public List<Change> AllChange();
}
