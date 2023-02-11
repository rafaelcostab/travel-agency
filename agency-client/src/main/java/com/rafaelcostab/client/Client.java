package com.rafaelcostab.client;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Client extends PanacheEntity{
    
    //nao utilizaremos id, pois o panache gerencia o id
    
    public String name;

}
