/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.Vo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author qwert
 */
@Entity
public class Bank {
    @Id
    private int id;
    
    int password;
    String owner;
    double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
