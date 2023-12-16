package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        try {
            Order result = warehouse.getOrder("3");
            System.out.println("Znalezione zamówienie: " + result.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Przepraszamy to zamówienie nie istnieje.");
        }
    }
}
