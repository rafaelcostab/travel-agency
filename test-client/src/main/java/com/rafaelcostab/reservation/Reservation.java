package com.rafaelcostab.reservation;

public class Reservation {
    
    private long id;

    private long clientId;

    public Reservation(){

    }

    public Reservation(long id, long clientId) {
        this.id = id;
        this.clientId = clientId;
    }

    public static Reservation of(long id, long clientId) {
        return new Reservation(id, clientId);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

}