package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLengthInitially() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(100, transactions[0]);
        assertEquals(-50, transactions[1]);
    }

    @Test
    public void shouldCalculateCorrectBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(50);

        assertEquals(150, cashMachine.getBalance());
    }

    @Test
    public void shouldCountNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);

        assertEquals(3, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldNotAddTransactionWithZeroAmount() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);

        assertEquals(0, cashMachine.getNumberOfTransactions());
    }
}
