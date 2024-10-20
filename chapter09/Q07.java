package HW.chapter01.chapter09;

import java.util.Date;

public class Q07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("\n          Account Statement");
        System.out.println("------------------------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Date created: " + account.getDateCreated());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.printf("Monthly interest: $%.2f\n",
                account.getMonthlyInterest());
    }

    public static class Account {
        private int id;
        private double balance;
        private static double annualInterestRate;
        private Date dateCreated;

        public Account() {
            id = 0;
            balance = 0;
            annualInterestRate = 0;
            dateCreated = new Date();
        }

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        public double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100);
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void deposit(double amount) {
            balance += amount;
        }
    }
}
