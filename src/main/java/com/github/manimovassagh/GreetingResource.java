package com.github.manimovassagh;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


public class GreetingResource {
  
    @GET()
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)

    public String helloSecond() {
        return "Hello from RESTEasy Reactive";
    }



 



    //this is a commit take it or not
  
}
