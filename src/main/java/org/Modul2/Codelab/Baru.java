package main.java.org.Modul2.Codelab;

public class Baru {
    // Kelas Product setelah refactoring
    public static class Product {
        //atribut dengan modifier private
        private String name;
        private double price;
        private int stock;

        // Konstanta untuk diskon
        private static final double DISCOUNT = 0.9;

        // Constructor untuk Product
        public Product(String name, double price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        // Getter dan Setter untuk `name`
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter dan Setter untuk `price`
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Getter dan Setter untuk `stock`
        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        // Menampilkan informasi produk
        public void displayProduct() {
            System.out.println("Product Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Discounted Price: $" + calculateDiscount());
            System.out.println("Stock: " + stock);
        }

        // Metode untuk menghitung harga diskon (Extract Method)
        public double calculateDiscount() {
            return getPrice() * DISCOUNT;
        }

        // Mengatur penyesuaian stok
        public void applyStockAdjustment(int adjustment) {
            stock += adjustment;
            System.out.println("Stock adjustment. New Stock: " + stock);
        }

        // Menampilkan informasi inventaris
        public void showInventory(Inventory inventory) {
            System.out.println("Location: " + inventory.getLocation());
            displayProduct();
        }
    }
}