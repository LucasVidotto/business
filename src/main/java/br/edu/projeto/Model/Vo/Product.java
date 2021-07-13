/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.Model.Vo;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author qwert
 */
@Entity
public class Product{
    public Product(){
        
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

 
    
    String Name;
    double price;
    String description;
    
    //@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //private Set<Sale> lsSale;
    
     @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
     private Set<Stock> lsStock;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
 
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    

    /*public Set<Sale> getLsSale() {
        return lsSale;
    }

    public void setLsSale(Set<Sale> lsSale) {
        this.lsSale = lsSale;
    }*/

    public Set<Stock> getLsStock() {
        return lsStock;
    }

    public void setLsStock(Set<Stock> lsStock) {
        this.lsStock = lsStock;
    }

    
    
    
}

