package com.rafaelcostab.reservation;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Reservation extends PanacheEntity {

    public long clientId;
    
}
