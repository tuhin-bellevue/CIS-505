package Module_4.BowlingShopApp;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Ball product.
 */
public class Ball extends Product {

    private String color = "";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ball() {

    }

    @Override
    public String toString() {
        return super.toString() +"\n" +
                "color=" + color + "\n";
       }
}
