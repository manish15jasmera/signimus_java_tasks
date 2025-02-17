// 1. Currency Converter:
// Create a class CurrencyConverter that utilizes Java's BigDecimal wrapper class for precise currency calculations.
// Define exchange rates: Store exchange rates for a few currencies (e.g., USD, EUR, GBP) within the class (you can use static final BigDecimal fields for this).

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<String, BigDecimal> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", BigDecimal.ONE);
        exchangeRates.put("EUR", new BigDecimal("0.85"));
        exchangeRates.put("GBP", new BigDecimal("0.75"));
        exchangeRates.put("INR", new BigDecimal("75.00"));
    }

    public static BigDecimal convert(BigDecimal amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency code.");
        }

        BigDecimal amountInUSD = amount.divide(exchangeRates.get(fromCurrency), 4, BigDecimal.ROUND_HALF_UP);
        
        return amountInUSD.multiply(exchangeRates.get(toCurrency)).setScale(4, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("100");
        String fromCurrency = "USD";
        String toCurrency = "EUR";

        BigDecimal convertedAmount = convert(amount, fromCurrency, toCurrency);
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
    }
}
