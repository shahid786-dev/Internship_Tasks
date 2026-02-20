package StockTradingPlateform;

public class Transaction {

    private String stockSymbol;
    private int quantity;
    private String type;

    public Transaction(String stockSymbol, int quantity, String type) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.type = type;
    }

    public void showTransaction() {
        System.out.println(type + " " + quantity + " shares of " + stockSymbol);
    }
}

