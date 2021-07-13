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
public class logged {
    @Id
    private Long COD;
    
    long idUser;

    public Long getCOD() {
        return COD;
    }

    public void setCOD(Long COD) {
        this.COD = COD;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
    
    
    
}
