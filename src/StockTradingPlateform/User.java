package StockTradingPlateform;

import java.util.HashMap;

public class User {

    private String name;
    private double balance;
    private HashMap<String, Integer> portfolio;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.portfolio = new HashMap<>();
    }

    public double getBalance() {
        return balance;
    }

    public void buyStock(String symbol, int qty, double price) {

        double totalCost = qty * price;

        if (balance >= totalCost) {
            balance -= totalCost;
            portfolio.put(symbol, portfolio.getOrDefault(symbol, 0) + qty);
            System.out.println("Bought " + qty + " shares of " + symbol);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void sellStock(String symbol, int qty, double price) {

        if (portfolio.containsKey(symbol) && portfolio.get(symbol) >= qty) {
            portfolio.put(symbol, portfolio.get(symbol) - qty);
            balance += qty * price;
            System.out.println("Sold " + qty + " shares of " + symbol);
        } else {
            System.out.println("Not enough shares!");
        }
    }

    public void showPortfolio() {
        System.out.println("\nPortfolio:");
        portfolio.forEach((k, v) -> System.out.println(k + " : " + v + " shares"));
        System.out.println("Balance: $" + balance);
    }

    public HashMap<String, Integer> getPortfolio() {
        return portfolio;
    }
}

