package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    private Shop shop;
    private Order order1, order2, order3;

    @BeforeEach
    public void initializeOrder() {
        shop = new Shop();
        order1 = new Order(100.0, "2023-11-30", "user1");
        order2 = new Order(200.0, "2023-12-30", "user2");
        order3 = new Order(300.0, "2024-01-02", "user3");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddNewOrder() {
        // given
        Order newOrder = new Order(150.0, "2022-09-12", "user4");

        // when
        shop.addOrder(newOrder);

        // then
        assertEquals(4, shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnOrdersWithinDateRange() {
        // when
        Set<Order> ordersInRange = shop.getOrdersInDateRange("2023-11-29", "2023-12-29");

        // then
        assertEquals(1, ordersInRange.size());
        assertTrue(ordersInRange.contains(order1));
    }

    @Test
    public void shouldReturnOrdersWithinValueRange() {
        // when
        Set<Order> ordersInValueRange = shop.getOrdersInValueRange(150.0, 250.0);

        // then
        assertEquals(1, ordersInValueRange.size());
        assertTrue(ordersInValueRange.contains(order2));
    }

    @Test
    public void shouldReturnCorrectNumberOfOrders() {
        // then
        assertEquals(3, shop.getNumberOfOrders());
    }

    @Test
    public void shouldSumOrderValues() {
        // then
        assertEquals(600.0, shop.sumOfOrderValues());
    }
}