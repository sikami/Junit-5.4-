package com.bankaccount;

public class BankAccount {
    public static class BankAccounts {
        private String firstName;
        private String lastName;
        private double balance;

        public static final int CHECKING = 1;
        public static final int SAVINGS = 2;

        private int accountType;

        public BankAccounts(String firstName, String lastName, double balance, int typeOfAccount) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.balance = balance;
            this.accountType = typeOfAccount;
        }

        //branch = true when customer do transaction at a branch/teller
        //branch = false otherwise

        public double deposit(double deposit, boolean branch) {
            this.balance += deposit;
            return this.balance;
        }

        public double withdraw(double amount, boolean branch) {
            if((amount > 500) && !branch) {
                throw new IllegalArgumentException("Not allowed to take above 500 at non branch");
            }
            this.balance -= amount;
            return this.balance;
        }

        public double getBalance() {
            return balance;
        }

        public boolean isChecking() {
            return  accountType == CHECKING;
        }
    }
}
