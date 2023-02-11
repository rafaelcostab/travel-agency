package com.rafaelcostab.reservation;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/reservation")
public class ReservationResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reservation> findAll() {
        return Reservation.listAll();
    }

    @Path("findById")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Reservation findById(@QueryParam("id") long id) {
        return Reservation.findById(id);
    }

    @Transactional
    @DELETE
    @Path("deleteById")
    public void deleteById(@QueryParam("id") long id) {
        Reservation.deleteById(id);
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createReservation(Reservation reservation) {
        reservation.id = null;
        reservation.persist();

        return Response.status(Status.CREATED).entity(reservation).build();
    }

}
