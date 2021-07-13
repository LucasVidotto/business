/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;


import br.edu.projeto.Model.Vo.Employee;

/**
 *
 * @author qwert
 */
public interface DAOEMployee {
    
    public void adicionarEmployee(Employee emp);

         public void removerEmployee(Employee emp, long id);

         public void atualizarEmployee(Employee emp);

         //public List<Employee> getAllEmployee();
         
         public void closed();
    
}
