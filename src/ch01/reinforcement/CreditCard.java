package ch01.reinforcement;

public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0);
    }

    public String getCustomer() {
        return this.customer;
    }

    public String getBank() {
        return this.bank;
    }

    public String getAccount() {
        return this.account;
    }

    public int getLimit() {
        return this.limit;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean charge(double price) {
        if (price + this.balance > this.limit) {
            return false;
        }
        this.balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount < 0) {
            System.out.println("You cannot make a negative payment.");
            return;
        }
        this.balance -= amount;
    }

    public void updateLimit(int limit) {
        this.limit = limit;
    }

    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }
}
