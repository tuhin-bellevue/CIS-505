package Module_4.BowlingShopApp;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Shoe product.
 */
public class Shoe extends Product{

    private double size = 0;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Shoe() {

    }

    @Override
    public String toString() {
        return super.toString() +"\n" +
                "size=" + size + "\n";
    }
}
