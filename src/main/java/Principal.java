


import br.edu.projeto.View.view.Display;
import br.edu.projeto.View.view.RegisterEmp;

import java.awt.Color;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qwert
 */
public class Principal {
    public static void main(String[] args) {
       /*EntityManagerFactory entityManagerFactory = Persistence
        .createEntityManagerFactory("Hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();*/
    
        /*Display display = new Display();
        display.setSize(500,400);
        display.getContentPane().setBackground(Color.BLACK);
        display.setVisible(true);*/
        
        RegisterEmp emp = new RegisterEmp();
        emp.getContentPane().setBackground(Color.BLACK);
        emp.setVisible(true);
    }
}
