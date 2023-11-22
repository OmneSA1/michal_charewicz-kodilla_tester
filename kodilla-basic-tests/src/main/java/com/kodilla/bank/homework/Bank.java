package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] newCashMachines = new CashMachine[cashMachines.length + 1];
        System.arraycopy(cashMachines, 0, newCashMachines, 0, cashMachines.length);
        newCashMachines[cashMachines.length] = cashMachine;
        cashMachines = newCashMachines;
        numberOfCashMachines++;
    }

    public int getTotalBalance() {
        int total = 0;
        for (CashMachine cashMachine : cashMachines) {
            total += cashMachine.getBalance();
        }
        return total;
    }

    public int getTotalNumberOfWithdrawals() {
        int totalWithdrawals = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    totalWithdrawals++;
                }
            }
        }
        return totalWithdrawals;
    }

    public int getTotalNumberOfDeposits() {
        int total = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    total++;
                }
            }
        }
        return total;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    sum += transaction;
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    public double getAverageDeposit() {
        double sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }
}
