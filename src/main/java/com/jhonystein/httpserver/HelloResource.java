package com.jhonystein.httpserver;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("nome") String nome){
        Map<String, String> dados = new HashMap<>();
        dados.put("mensagem", "Olá " + nome);

        return Response.ok(dados).build();
    }

}