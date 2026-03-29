package edu.ecommerce;

public class Order {
    private String idPesanan;
    private String namaPembeli;
    private double total;

    public Order(String idPesanan, String namaPembeli) {
        this.idPesanan = idPesanan;
        this.namaPembeli = namaPembeli;
    }

    public class OrderItem {
        private String productName;
        private double price;
        private int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }

        public String getProductName() { return productName; }
        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }
    }

    public double hitungTotal(OrderItem[] items) {
        this.total = 0;
        for (OrderItem item : items) {
            this.total += item.getSubtotal();
        }
        return this.total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("ID Pesanan      : " + idPesanan);
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("---------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-5s | %-10s\n", "Produk", "Harga", "Qty", "Subtotal");
        System.out.println("---------------------------------------------------------");

        for (OrderItem item : items) {
            System.out.printf("| %-20s | Rp%-9.0f | %-5d | Rp%-10.0f\n",
                    item.getProductName(), item.getPrice(), item.getQuantity(), item.getSubtotal());
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("TOTAL PESANAN : Rp%.0f\n", hitungTotal(items));
        System.out.println("=========================================================");
    }
}