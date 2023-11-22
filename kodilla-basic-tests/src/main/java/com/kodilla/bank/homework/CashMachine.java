package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int numberOfTransactions;

    public CashMachine() {
        this.transactions = new int[0];
        this.numberOfTransactions = 0;
    }

    public void addTransaction(int amount) {
        if (amount == 0) {
            return;
        }
        int[] newTransactions = new int[transactions.length + 1];
        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
        newTransactions[transactions.length] = amount;
        transactions = newTransactions;
        numberOfTransactions++;
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int[] getTransactions() {
        return transactions;
    }
}
