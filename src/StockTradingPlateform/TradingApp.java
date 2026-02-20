package StockTradingPlateform;

import java.util.Scanner;

public class TradingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Market market = new Market();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        User user = new User(name, 10000); // Starting balance

        while (true) {

            System.out.println("\n===== Stock Trading Platform =====");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    market.showMarket();
                    break;

                case 2:
                    System.out.print("Enter Stock Symbol: ");
                    String buySymbol = sc.next();
                    System.out.print("Enter Quantity: ");
                    int buyQty = sc.nextInt();

                    Stock buyStock = market.getStock(buySymbol);
                    if (buyStock != null)
                        user.buyStock(buySymbol, buyQty, buyStock.getPrice());
                    else
                        System.out.println("Stock not found!");
                    break;

                case 3:
                    System.out.print("Enter Stock Symbol: ");
                    String sellSymbol = sc.next();
                    System.out.print("Enter Quantity: ");
                    int sellQty = sc.nextInt();

                    Stock sellStock = market.getStock(sellSymbol);
                    if (sellStock != null)
                        user.sellStock(sellSymbol, sellQty, sellStock.getPrice());
                    else
                        System.out.println("Stock not found!");
                    break;

                case 4:
                    user.showPortfolio();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}

