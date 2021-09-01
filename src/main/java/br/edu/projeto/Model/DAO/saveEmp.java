/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.DAO;

import br.edu.projeto.Model.Vo.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author qwert
 */
public class saveEmp implements DAOEMployee{
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
        
    @Override
    public void adicionarEmployee(Employee emp) {
        
        try{
             manager.getTransaction().begin();
             if(emp.getId( )== null){
                 manager.persist(emp);
             }else{
                 manager.merge(emp);

             }
             manager.getTransaction().commit();
        }catch (Exception e) {
			System.err.println(e);
			manager.getTransaction().rollback();
        }finally {
			//factory.close();
        }
    }

    @Override
    public void removerEmployee(Employee emp, long id) {
         Employee EmpFind = manager.find(Employee.class, id);
        TypedQuery<Employee> consulta = manager.createQuery("SELECT emp FROM Employee emp", Employee.class);
       
        List<Employee> lista = consulta.getResultList();
        
         //JOptionPane.showMessageDialog(null, "lista : ");
        
        manager.getTransaction().begin();
        manager.remove(EmpFind);
        manager.getTransaction().commit();
        
    }

    @Override
    public void atualizarEmployee(Employee emp) {

    }
    
    public void closed(){
        factory.close();
    }
    
}
