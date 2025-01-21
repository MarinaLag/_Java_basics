package by.lidcode._3_стримы.liveCoding_3.sale;

public class Sale {
    String productName;
    String category;
    double price;
    int quantity;

    Sale(String productName, String category, double price, int quantity) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public double getTotalSale() {
        return price * quantity;
    }
}
