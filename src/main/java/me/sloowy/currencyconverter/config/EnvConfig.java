package me.sloowy.currencyconverter.config;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {

    private static Dotenv dotenv = Dotenv.load();

    public static String get(String key) {
        return dotenv.get(key);
    }
}
