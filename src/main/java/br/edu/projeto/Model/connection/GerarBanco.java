/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author qwert
 */
public class GerarBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Hibernate");
         
         EntityManager manager = factory.createEntityManager();
         
         JOptionPane.showMessageDialog(null,"banco gerado");
         
    }

    
    
}
