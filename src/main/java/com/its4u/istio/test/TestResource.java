package com.its4u.istio.test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/test")
public class TestResource {

    @Inject
    @RestClient
    GreetingResource greetingResource;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test(@QueryParam("name") String name) {
        return greetingResource.hello(name);
    }
}
