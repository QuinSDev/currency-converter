package com.currencyconverter.service;

import com.currencyconverter.module.ApiKey;
import com.currencyconverter.module.Currency;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class CheckCurrency {
    private String targetCurrency;
    private String currentCurrency;
    ApiKey apiKey = new ApiKey();

    public Currency optionCurrency(int option) {

        switch (option) {
            case 1:
                targetCurrency = "COP";
                currentCurrency = "USD";
                return searchCurrency(currentCurrency);
            case 2:
                targetCurrency = "USD";
                currentCurrency = "COP";
                return searchCurrency(currentCurrency);
            case 3:
                targetCurrency = "BRL";
                currentCurrency = "USD";
                return searchCurrency(currentCurrency);
            case 4:
                targetCurrency = "USD";
                currentCurrency = "BRL";
                return searchCurrency(currentCurrency);
            case 5:
                targetCurrency = "ARS";
                currentCurrency = "USD";
                return searchCurrency(currentCurrency);
            case 6:
                targetCurrency = "USD";
                currentCurrency = "ARS";
                return searchCurrency(currentCurrency);
            case 7:
                break;
            default:
                System.out.println("Opción incorrecta");
                System.out.println("");
        }
        return null;
    }

    public Currency searchCurrency(String currency) {
        URI address = URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey.getApiKey() + "/latest/"+currency);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la moneda a convertir" + e.getMessage());
        }
    }

    public void converterCurrency(Currency currency, Double valor) {
        HashMap<String, Double> rates = currency.conversion_rates();
        if (rates != null && rates.containsKey(targetCurrency)) {
            double convertedAmount = rates.get(targetCurrency) * valor;
            String formattedValor = String.format("%.2f", valor);
            String formattedAmount = String.format("%.2f", convertedAmount);
            System.out.println("El valor " + formattedValor + " [" + currentCurrency + "] corresponde" +
                    " al valor final de ==>> " + formattedAmount + " [" + targetCurrency + "]");
            System.out.println("" +
                    "");
        } else {
            throw new RuntimeException("No se encontró la tasa de cambio para " + targetCurrency);
        }
    }
}
