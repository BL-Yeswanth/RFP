package objectOriented.OopsPracticePrograms;

/**
 * AccountDebitTest
 *
 * Demonstrates debit operation on an Account
 * ensuring debit amount does not exceed balance.
 */
public class AccountDebitTest {

    /**
     * Account class represents a bank account.
     */
    static class Account {

        private double balance;

        /**
         * Constructor to initialize balance.
         *
         * @param initialBalance starting balance
         */
        public Account(double initialBalance) {
            if (initialBalance > 0) {
                balance = initialBalance;
            }
        }

        /**
         * Method to withdraw money from account.
         *
         * @param amount amount to debit
         */
        public void debit(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Debit successful. Amount withdrawn: " + amount);
            } else {
                System.out.println("Debit amount exceeded account balance.");
            }
        }

        /**
         * Returns current balance.
         *
         * @return balance
         */
        public double getBalance() {
            return balance;
        }
    }

    /**
     * Main method to test debit functionality.
     */
    public static void main(String[] args) {

        Account account = new Account(1000);

        System.out.println("Initial Balance: " + account.getBalance());

        account.debit(300);
        System.out.println("Balance after debit: " + account.getBalance());

        account.debit(800); // exceeds balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
