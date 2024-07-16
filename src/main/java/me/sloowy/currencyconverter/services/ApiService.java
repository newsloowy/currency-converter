package me.sloowy.currencyconverter.services;

import me.sloowy.currencyconverter.config.EnvConfig;
import me.sloowy.currencyconverter.dto.GsonConverter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class ApiService {

    private String apiKey = EnvConfig.get("EXCHANGE_RATE_API_KEY");

    public String convertCurrency(String convertFrom, String convertTo, Double amount) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%f".formatted(apiKey, convertFrom, convertTo, amount)))
                .build();

        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        var conversionResult = GsonConverter.convert(response);

        System.out.println("Valor %f [%s] corresponde ao valor final de ==> %f [%s]".formatted(amount, convertFrom, conversionResult, convertTo));
        return response.body();
    }
}
