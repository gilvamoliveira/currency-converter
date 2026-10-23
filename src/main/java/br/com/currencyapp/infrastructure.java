package br.com.currencyapp;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class infrastructure {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY_VARIABLE = "EXCHANGE_RATE_API_KEY";

    private final HttpClient client = HttpClient.newHttpClient();

    public String getRates() {

        String apiKey = System.getenv(API_KEY_VARIABLE);

        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException(
                    "Defina a variável de ambiente " + API_KEY_VARIABLE + " com sua chave da ExchangeRate-API."
            );
        }

        String url = BASE_URL + apiKey + "/latest/USD";

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new IllegalStateException(
                        "API respondeu com status " + response.statusCode() + "."
                );
            }

            return response.body();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao acessar API.", e);
        }
    }
}