/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Logado;
import br.edu.projeto.Model.Vo.Product;

/**
 *
 * @author qwert
 */
public interface DAOLogado {
    
    public void Logar(Logado log);

    public void Deslogar(Logado log, long id);
    
    public void closed();
    
    public Long FindLog();
    
}
