package me.sloowy.currencyconverter.cli;

import me.sloowy.currencyconverter.services.ApiService;

import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void startConverter() {
        String menu = """
                ******************************************************
                [ Seja bem-vindo(a) ao Conversor de Moedas ]
                
                (1) Dólar ==> Peso Argentino
                (2) Peso Argentino ==> Dólar
                (3) Dólar ==> Real Brasileiro
                (4) Real Brasileiro ==> Dólar
                (5) Dólar ==> Peso Colombiano
                (6) Peso Colombiano ==> Dólar
                (0) Sair
                
                Escolha uma opção válida:
                ******************************************************
                """;

        int option = -1;
        while (option != 0) {
            System.out.println(menu);

            option = scanner.nextInt();

            System.out.println("Digite o valor que deseja converter:");
            Double amount = scanner.nextDouble();

            ApiService apiService = new ApiService();
            switch (option) {
                case 1:
                    apiService.convertCurrency("USD", "ARS", amount);
                    break;
                case 2:
                    apiService.convertCurrency("ARS", "USD", amount);
                    break;
                case 3:
                    apiService.convertCurrency("USD", "BRL", amount);
                    break;
                case 4:
                    apiService.convertCurrency("BRL", "USD", amount);
                    break;
                case 5:
                    apiService.convertCurrency("USD", "COP", amount);
                    break;
                case 6:
                    apiService.convertCurrency("COP", "USD", amount);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
