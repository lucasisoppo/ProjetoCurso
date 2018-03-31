package com.jhonystein.httpserver;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("imc")
public class ImcResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response calcularImc(
            @QueryParam("nome") String nome,
            @QueryParam("peso") Double peso,
            @QueryParam("altura") Double altura) {
        
        Double imc = peso / (altura * altura);
        
        Map<String, String> dados = new HashMap<>();
        dados.put("mensagem", 
             String.format("Olá %s, seu IMC é: %.2f", nome, imc));
        
        return Response.ok(dados).build();
    }
    
}
