package main.java.org.Modul2.Codelab;

// Kelas Main yang baru setelah pemindahan metode `main`
public class Main {
    public static void main(String[] args) {
        // Membuat objek `Product` dan `Inventory`
        Baru.Product prod = new Baru.Product("Smartphone", 699.99, 50);
        Inventory inv = new Inventory(prod, "Warehouse A");

        // Menampilkan informasi inventaris
        inv.getProduct().showInventory(inv);

        // Menyesuaikan stok dan menampilkan informasi terbaru
        prod.applyStockAdjustment(10);
        inv.getProduct().showInventory(inv);
    }
}
