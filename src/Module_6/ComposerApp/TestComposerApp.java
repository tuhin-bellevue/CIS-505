package Module_6.ComposerApp;

import Module_5.ExpenseTracker.ValidatorIO;

import java.util.List;
import java.util.Scanner;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Test class to test Module 6 assignment
 */
public class TestComposerApp {

    /**
     *
     * Main method to test functionality of TestExpenseTracker application
     */

    public static void main(String[] args) {
        System.out.println(menu());
        MemComposerDao memComposerDao = new MemComposerDao();
            Scanner sc = new Scanner(System.in);
            int input = (Integer.parseInt(sc.next()));
            if(1==input) {
                List<Composer> composers = memComposerDao.findAll();
                for(Composer composer : composers) {
                    System.out.println(composer);
                }
            }

            if(2==input) {
                System.out.println("Please enter an ID");
                int id = sc.nextInt();
                Composer composer = memComposerDao.findBy(id);
                System.out.println(composer);
            }

            if(3==input) {
                System.out.println("Please create a new composer");
                System.out.println("Please provide an ID");
                int id = sc.nextInt();
                System.out.println("Please provide a name");
                String name = sc.next();
                System.out.println("Please provide a genre");
                String genre = sc.next();

                memComposerDao.insert(new Composer(id,name,genre));
                System.out.println(memComposerDao.findBy(id));
            }

        if(4==input) {
            System.out.println("Exiting....");
        }
    }

    /**
     *
     * @return a String
     */

    public static String menu(){
        StringBuilder builder = new StringBuilder();
        builder.append("Welcome to the Composer App")
                .append("\n")
                .append("MENU OPTIONS")
                .append("\n")
                .append("   1. View Composers")
                .append("\n")
                .append("   2. Find Composers")
                .append("\n")
                .append("   3. Add Composer")
                .append("\n")
                .append("   4. Exit")
                .append("\n")
                .append("\n")
                .append("Please choose an option:");

        return builder.toString();
    }
}
