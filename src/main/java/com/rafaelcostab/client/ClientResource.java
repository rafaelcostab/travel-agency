package com.rafaelcostab.client;

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

@Path("/client")
public class ClientResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> findAll() {
        return Client.listAll();
    }

    @GET
    @Path("findById")
    @Produces(MediaType.APPLICATION_JSON)
    public Client findById(@QueryParam("id") long id) {
        return Client.findById(id);
    }

    @Transactional
    @DELETE
    @Path("deleteById")
    public void deleteById(long id) {
        Client.deleteById(id);
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createClient(Client client) {
        client.id = null;
        client.persist();

        return Response.status(Status.CREATED).entity(client).build();
    }

}
