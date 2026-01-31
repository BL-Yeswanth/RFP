package objectOriented.OopsPracticePrograms;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * StockAccount
 *
 * Commercial Data Processing program to manage company shares.
 */
public class StockAccount {

    /**
     * CompanyShares represents a stock transaction.
     */
    static class CompanyShares {

        private String stockSymbol;
        private int numberOfShares;
        private LocalDateTime transactionTime;

        public CompanyShares(String stockSymbol, int numberOfShares) {
            this.stockSymbol = stockSymbol;
            this.numberOfShares = numberOfShares;
            this.transactionTime = LocalDateTime.now();
        }

        public String getStockSymbol() {
            return stockSymbol;
        }

        public int getNumberOfShares() {
            return numberOfShares;
        }

        public void setNumberOfShares(int numberOfShares) {
            this.numberOfShares = numberOfShares;
            this.transactionTime = LocalDateTime.now();
        }

        public LocalDateTime getTransactionTime() {
            return transactionTime;
        }

        public void display() {
            System.out.println(
                    "Stock: " + stockSymbol +
                            ", Shares: " + numberOfShares +
                            ", Last Transaction: " + transactionTime
            );
        }
    }

    // List of company shares
    private List<CompanyShares> companySharesList = new ArrayList<>();

    /**
     * Buy shares of a company.
     *
     * @param stockSymbol company stock symbol
     * @param shares number of shares to buy
     */
    public void buy(String stockSymbol, int shares) {

        for (CompanyShares cs : companySharesList) {
            if (cs.getStockSymbol().equalsIgnoreCase(stockSymbol)) {
                cs.setNumberOfShares(cs.getNumberOfShares() + shares);
                System.out.println("Bought " + shares + " shares of " + stockSymbol);
                return;
            }
        }

        // If stock does not exist, create new
        companySharesList.add(new CompanyShares(stockSymbol, shares));
        System.out.println("Bought " + shares + " shares of " + stockSymbol);
    }

    /**
     * Sell shares of a company.
     *
     * @param stockSymbol company stock symbol
     * @param shares number of shares to sell
     */
    public void sell(String stockSymbol, int shares) {

        for (CompanyShares cs : companySharesList) {
            if (cs.getStockSymbol().equalsIgnoreCase(stockSymbol)) {

                if (cs.getNumberOfShares() >= shares) {
                    cs.setNumberOfShares(cs.getNumberOfShares() - shares);
                    System.out.println("Sold " + shares + " shares of " + stockSymbol);
                } else {
                    System.out.println("Not enough shares to sell for " + stockSymbol);
                }
                return;
            }
        }

        System.out.println("Stock not found: " + stockSymbol);
    }

    /**
     * Print stock report.
     */
    public void printReport() {
        System.out.println("\n----- Stock Account Report -----");
        for (CompanyShares cs : companySharesList) {
            cs.display();
        }
    }

    /**
     * Main method to test StockAccount.
     */
    public static void main(String[] args) {

        StockAccount account = new StockAccount();

        account.buy("TCS", 100);
        account.buy("INFY", 50);
        account.buy("TCS", 20);

        account.sell("INFY", 10);
        account.sell("TCS", 200); // insufficient shares
        account.sell("WIPRO", 10); // stock not found

        account.printReport();
    }
}
