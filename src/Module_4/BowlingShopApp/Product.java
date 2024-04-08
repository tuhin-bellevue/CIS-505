package Module_4.BowlingShopApp;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Super class product.
 */
public class Product {

    private String code;
    private String description;
    private double price;

    public Product() {
        this.code = "P0";
        this.description="Default Product";
        this.price=10.5;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "---Product Details---"+ "\n" +
                "code:" + code + "\n" +
                "description:" + description + "\n" +
                "price: " + "$ "+ price + "\n";
    }
}
