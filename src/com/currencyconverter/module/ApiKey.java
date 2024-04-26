package com.currencyconverter.module;

import java.io.*;

public class ApiKey {

    private String apiKey;

    public ApiKey() {
        loadApiKey();
    }

    private void loadApiKey() {
        try (BufferedReader reader = new BufferedReader(new FileReader("api_key.txt"))) {
            String apiKey = reader.readLine();
            this.apiKey = apiKey.trim();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getApiKey() {
        return apiKey;
    }
}
