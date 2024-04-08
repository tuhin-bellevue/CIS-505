package Module_4.BowlingShopApp;

import java.util.Scanner;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Test class to test Module 4 assignment
 */
public class TestBowlingShopApp {

    public static void main(String[] args) {
        displayMenu();
    }

    /**
     * This method provides option for user input and display as per user input
     */
    public static void displayMenu() {
        while(true) {
            System.out.println("MENU OPTIONS");
            System.out.println("   1. <b> Bowling Balls");
            System.out.println("   2. <a> Bowling Bags");
            System.out.println("   3. <s> Bowling Shoes");
            System.out.println("   4. <x> To Exit");
            System.out.println("\n");
            System.out.println("Please choose an option:");
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.next();
            if("x".equalsIgnoreCase(userChoice)){
                break;
            }
            GenericQueue<Product> products = ProductDB.getProducts(userChoice);

            while (products.size() > 0) {
                System.out.println(products.dequeue().toString());
            }
        }
    }

}
