package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.0);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoices(){
        //when
        int numberOfItems = invoice.getSize();

        //then
        assertEquals(3,numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        //when
        Item result = invoice.getItem(2);

        //then
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(),0.01);

    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {

        //when
        Item result = invoice.getItem(-1);

        //then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //when
        invoice.clear();

        //then
        assertEquals(0,invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}