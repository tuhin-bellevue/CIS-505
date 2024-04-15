package Module_5.ExpenseTracker;

import java.util.Scanner;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    ValidatorIO class
 */
public class ValidatorIO {

    /**
     *
     * @param sc -> Reference of Scanner class
     * @param prompt -> Input options for an user
     * @return integer option chosen by user on the console
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;

        while(!isValid){

            System.out.println(prompt);

            if(sc.hasNext()){
                input = sc.nextInt();
                isValid = true;
            }
            else {
                System.out.println("\n Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     *
     * @param sc -> Reference of Scanner class
     * @param prompt -> Input options for an user
     * @return double option chosen by user on the console
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0.0;
        boolean isValid = false;

        while(!isValid){

            System.out.println(prompt);

            if(sc.hasNext()){
                input = sc.nextDouble();
                isValid = true;
            }
            else {
                System.out.println("\n Error! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     *
     * @param sc -> Reference of Scanner class
     * @param prompt -> Input options for an user
     * @return String option chosen by user on the console
     */
    public static String getString(Scanner sc, String prompt) {
        String input = "";
        System.out.println(prompt);

        input = sc.nextLine();
        return input;
    }
}
