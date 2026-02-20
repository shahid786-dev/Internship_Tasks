package StockTradingPlateform;

import java.util.HashMap;

public class Market {

    private HashMap<String, Stock> stocks;

    public Market() {
        stocks = new HashMap<>();
        stocks.put("AAPL", new Stock("AAPL", 150));
        stocks.put("GOOG", new Stock("GOOG", 2800));
        stocks.put("TSLA", new Stock("TSLA", 900));
    }

    public void showMarket() {
        System.out.println("\nMarket Data:");
        stocks.forEach((k, v) ->
                System.out.println(k + " : $" + v.getPrice())
        );
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }
}
