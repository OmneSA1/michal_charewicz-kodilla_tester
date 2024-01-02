package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();
    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> getOrdersInDateRange(String startDate, String endDate) {
        return orders.stream()
                .filter(order -> order.getDate().compareTo(startDate) >= 0 && order.getDate().compareTo(endDate) <= 0)
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersInValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double sumOfOrderValues() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}
