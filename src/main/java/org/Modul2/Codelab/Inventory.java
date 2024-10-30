package main.java.org.Modul2.Codelab;

// Kelas Inventory setelah refactoring
public class Inventory {
    private Baru.Product product;
    private String location;

    // Constructor untuk Inventory
    public Inventory(Baru.Product product, String location) {
        this.product = product;
        this.location = location;
    }

    // Setter dan Getter untuk `product`
    public Baru.Product getProduct() {
        return product;
    }

    public void setProduct(Baru.Product product) {
        this.product = product;
    }

    // Setter dan Getter untuk `location`
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
