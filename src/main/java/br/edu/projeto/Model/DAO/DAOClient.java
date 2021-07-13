/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Client;
import java.awt.List;

/**
 *
 * @author qwert
 */
public interface DAOClient {
    
     public void adicionarClient(Client client);

         public void getClient(long id);
        

         public void removerClient(Client cli, long id);

         public void atualizarClient(Client Client);
         
         public void closed();

         //public List<Client> AllClient();
}
