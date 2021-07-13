/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Stock;

/**
 *
 * @author qwert
 */
public interface DAOStock {
    
    public void adicionarStock(Stock sto);

    public void removerStock(Stock pro, long id);

    public void atualizarStock(Stock pro);
         
    public void closed();
    
}
