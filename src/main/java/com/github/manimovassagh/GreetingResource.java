package com.github.manimovassagh;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
//checkt
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

//this is a commit take it or not
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return "Hello from RESTEasy Reactive for second time";
    }
}
