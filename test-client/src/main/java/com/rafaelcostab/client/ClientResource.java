package com.rafaelcostab.client;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/client-cli")
public class ClientResource {
    
    @Inject
    @RestClient
    ClientService clientService;

    @GET
    @Path("/findById")
    @Produces(MediaType.APPLICATION_JSON)
    public Client findById(@QueryParam("id") long id){
        return clientService.findById(id);
    }

    @GET
    @Path("/createClient")
    public String createClient() {
        Client client = Client.of(99, "remote");
        return clientService.createClient(client);
    }

}
