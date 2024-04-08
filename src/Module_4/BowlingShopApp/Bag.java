package Module_4.BowlingShopApp;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Bag product.
 */
public class Bag extends Product {

    private String type = "";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bag() {

    }

    @Override
    public String toString() {
        return super.toString() +"\n" +
                "type=" + type + "\n";
       }
}
