public class CurrencyConverter {

    public double convert(Currency fromCurrency, Currency toCurrency, double amount) throws Exception {
        double rate = ExchangeRateAPI.getExchangeRate(fromCurrency.getCode(), toCurrency.getCode());
        return amount * rate;
    }

}
