package com.aluracursos.api;

import com.aluracursos.record.Convertidor;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Convertidor convertir(Double cantidad, String monedaOrigen, String monedaDestino) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/65c80bedf0f84c6057c4e8a6/pair/"+
                monedaOrigen+"/"+monedaDestino+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Convertidor.class);
        } catch (Exception e) {
            throw new RuntimeException("Error, no se pudo realizar la conversión");
        }
    }
}
