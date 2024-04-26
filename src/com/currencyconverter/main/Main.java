package com.currencyconverter.main;

import com.currencyconverter.module.Currency;
import com.currencyconverter.service.CheckCurrency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CheckCurrency checkCurrency = new CheckCurrency();
        Scanner read = new Scanner(System.in);

        int option = 0;
        double valor = 0;
        String menuMessage = """
                *****************************************
                    Bienvenido al conversor de moneda
                -----------------------------------------
                |   1) Dólar =>> Peso colombiano        |
                |   2) Peso colombiano =>> Dólar        |
                |   3) Dólar =>> Real brasileño         |
                |   4) Real brasileño =>> Dólar         |
                |   5) Dólar =>> Peso argentino         |
                |   6) Peso argentino =>> Dólar         |
                |   7) Salir                            |
                -----------------------------------------
                """;

        do {
            try {
                System.out.println(menuMessage);
                System.out.print("Elige la opción que deseas realizar: ");
                option = Integer.parseInt(read.next());
                Currency currency = checkCurrency.optionCurrency(option);

                if (option >= 1 && option <=6) {
                    System.out.print("¿Cuánto deseas convertir?: ");
                    valor = Double.parseDouble(read.next());
                    checkCurrency.converterCurrency(currency, valor);
                }

            } catch (NumberFormatException e) {
                System.out.println("Formato de número incorrecto = " + e.getMessage());
                System.out.println("");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }  while (option != 7);

        System.out.println("Gracias por usar nuestro conversor de monedas.");
    }
}
