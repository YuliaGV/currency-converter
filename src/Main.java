import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void printCurrencyList(List<Currency> currencies) {
        for (int i = 0; i < currencies.size(); i++) {
            System.out.println((i + 1) + ". " + currencies.get(i));
        }
    }

    public static void main(String[] args) {

        try {

            CurrencyConverter converter = new CurrencyConverter();

            // Crear lista de monedas
            List<Currency> currencies = Arrays.asList(
                    new Currency("USD", "Dólar Estadounidense"),
                    new Currency("COP", "Peso Colombiano"),
                    new Currency("MXN", "Peso Mexicano"),
                    new Currency("ARS", "Peso Argentino"),
                    new Currency("JPY", "Yen"),
                    new Currency("CNY", "Yuan"),
                    new Currency("EUR", "Euro"),
                    new Currency("GBP", "Libra Esterlina")
            );

            Scanner scanner = new Scanner(System.in);

            System.out.println("Seleccione la moneda de origen:");
            printCurrencyList(currencies);
            int fromIndex = scanner.nextInt() - 1;
            Currency fromCurrency = currencies.get(fromIndex);

            System.out.println("Seleccione la moneda de destino:");
            printCurrencyList(currencies);
            int toIndex = scanner.nextInt() - 1;
            Currency toCurrency = currencies.get(toIndex);

            System.out.println("Ingrese la cantidad a convertir:");
            double amount = scanner.nextDouble();

            // Realizar la conversión
            double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);

            System.out.println(amount + " " + fromCurrency.getName() + " son " + convertedAmount + " " + toCurrency.getName());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}