/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.Vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author qwert
 */
@Entity
public class Logado {
    
    @Id
    private Long code;
    
    long iduser;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
    
    
    
}
