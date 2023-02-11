package com.rafaelcostab.reservation;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/reservation-cli")
public class ReservationResource {
    
    @Inject
    @RestClient
    ReservationService reservationService;

    @GET
    @Path("createReservation")
    @Produces(MediaType.APPLICATION_JSON)
    public String createReservation(){
        Reservation reservation = Reservation.of(0, 2);

        return reservationService.createReservation(reservation);
    }

}
