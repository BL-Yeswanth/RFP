package objectOriented.OopsPracticePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Stock Account Management Program
 */
public class StockAccountManagement {

    /**
     * Stock class represents a single stock
     */
    static class Stock {
        String stockName;
        int numberOfShares;
        double sharePrice;

        Stock(String stockName, int numberOfShares, double sharePrice) {
            this.stockName = stockName;
            this.numberOfShares = numberOfShares;
            this.sharePrice = sharePrice;
        }

        double getStockValue() {
            return numberOfShares * sharePrice;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Stock> stockList = new ArrayList<>();

        System.out.println("Welcome to Stock Account Management Program");

        System.out.print("Enter number of stocks: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Stock " + i);

            System.out.print("Stock Name: ");
            String name = scanner.next();

            System.out.print("Number of Shares: ");
            int shares = scanner.nextInt();

            System.out.print("Share Price: ");
            double price = scanner.nextDouble();

            stockList.add(new Stock(name, shares, price));
        }

        double totalStockValue = 0;

        System.out.println("\nSTOCK REPORT");
        System.out.println("-------------------------------------------");
        System.out.println("Stock Name\tShares\tPrice\tValue");
        System.out.println("-------------------------------------------");

        for (Stock stock : stockList) {
            double stockValue = stock.getStockValue();
            totalStockValue += stockValue;

            System.out.println(
                    stock.stockName + "\t\t" +
                            stock.numberOfShares + "\t" +
                            stock.sharePrice + "\t" +
                            stockValue
            );
        }

        System.out.println("-------------------------------------------");
        System.out.println("Total Stock Value = " + totalStockValue);

        scanner.close();
    }
}
