package ro.fasttrackit.curs7.homework;

public class Product {
    private String productName;
    private double productPrice;
    private int quantity;
    private String category;

    public Product(String productName, double productPrice, int quantity, String category) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return productName;
    }

    public double getPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (quantity > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory(String category) {
        if (this.category.equals(category)){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return productName + ", price: " + productPrice + " lei, quantity: " + quantity + " and belongs to the category: " + category;
    }
}
