package me.sloowy.currencyconverter.dto;

import com.google.gson.Gson;

import java.net.http.HttpResponse;

public class GsonConverter {

    public static Double convert(HttpResponse<String> response) {
        Gson gson = new Gson();
        var conversionResult = gson.fromJson(response.body(), ConversionResult.class);

        return conversionResult.conversion_result();
    }
}
