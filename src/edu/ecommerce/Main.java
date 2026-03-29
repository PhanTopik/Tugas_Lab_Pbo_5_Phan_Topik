package edu.ecommerce;

public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order("ORD-001", "Akief");

        Order.OrderItem item1 = myOrder.new OrderItem("Laptop Gaming", 15000000, 1);
        Order.OrderItem item2 = myOrder.new OrderItem("Mouse Wireless", 350000, 2);
        Order.OrderItem item3 = myOrder.new OrderItem("Mousepad RGB", 150000, 1);

        Order.OrderItem[] listPesanan = {item1, item2, item3};

        myOrder.tampilkanRincian(listPesanan);
    }
}