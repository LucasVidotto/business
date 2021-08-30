/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.Verification;

import br.edu.projeto.Model.DAO.FindGeral;
import br.edu.projeto.Model.Vo.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author qwert
 */
public class CheckEmp {//Regra de negócio
    int number = 3;
    EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("Hibernate");
        
        EntityManager manager = factory.createEntityManager();
    public int CheckUser(String user){
        FindGeral find = new FindGeral();
        int number = 3;
        
        
        for(Employee emp:find.findEmp()){
                if(emp.getName().equals(user)){
                    
                    number = 0;
                    break;
                    //JOptionPane.showConfirmDialog(null,"Já exite esse User Name");
                }else{
                    number = 1;
     
                }
        }
        return number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
