//package main.java.org.Modul2.Codelab;
//
//public class Product {
//    public String name;
//    public double price;
//    public int stock;
//
//    public Product(String name, double price, int stock){
//        this.name = name;
//        this.price = price;
//        this.stock = stock;
//    }
//    public void displayProduct(){
//        double discountedPrice = price * 0.9; // 10% discount
//        System.out.println("Product Name: " + name);
//        System.out.println("Price: $" + price);
//        System.out.println("Discounted Price: $" + discountedPrice);
//        System.out.println("Stock: " + stock);
//    }
//    public void applyStockAdjusment(int adjusment){
//        stock += adjusment;
//        System.out.println("Stock adjusment. New Stock: " + stock);
//    }
//}
//public class Inventory {
//    public Product product;
//    public String Location;
//
//    public Inventory(Product product, String location){
//        this.product = product;
//        this.location = location;
//    }
//    public void showInventory(){
//        System.out.println("Location: " + location);
//        product.displayProduct();
//    }
//}
//
//public class MainApp{
//    public static void main(String[] args){
//        Product prod = new Product("Smarthphone", 699.99, 50);
//        Inventory inv = new Inventory(prod, "Warehouse A");
//
//        inv.showInventory();
//        prod.applyStockedAdjusment(10);
//        inv.showInventory();
//    }
//}