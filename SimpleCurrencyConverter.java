import java.util.Scanner;

public class SimpleCurrencyConverter {

    // Method to get the exchange rate between two currencies
    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Hardcoded exchange rates (these are just example rates and may not be accurate)
        double rate = 1.0;

        // USD to other currencies
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            rate = 0.85;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            rate = 0.75;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("JPY")) {
            rate = 110.0;
        }

        // EUR to other currencies
        else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            rate = 1.18;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("GBP")) {
            rate = 0.88;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("JPY")) {
            rate = 129.0;
        }

        // GBP to other currencies
        else if (baseCurrency.equals("GBP") && targetCurrency.equals("USD")) {
            rate = 1.33;
        } else if (baseCurrency.equals("GBP") && targetCurrency.equals("EUR")) {
            rate = 1.14;
        } else if (baseCurrency.equals("GBP") && targetCurrency.equals("JPY")) {
            rate = 146.0;
        }

        // JPY to other currencies
        else if (baseCurrency.equals("JPY") && targetCurrency.equals("USD")) {
            rate = 0.0091;
        } else if (baseCurrency.equals("JPY") && targetCurrency.equals("EUR")) {
            rate = 0.0078;
        } else if (baseCurrency.equals("JPY") && targetCurrency.equals("GBP")) {
            rate = 0.0068;
        }

        return rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the base currency (e.g. USD): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (e.g. EUR): ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Get the exchange rate
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == 1.0 && !baseCurrency.equals(targetCurrency)) {
            System.out.println("Currency pair not supported.");
        } else {
            // Convert the amount and display the result
            double convertedAmount = amount * exchangeRate;
            System.out.printf("Conversion: %.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}