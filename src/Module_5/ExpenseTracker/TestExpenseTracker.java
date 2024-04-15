package Module_5.ExpenseTracker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    ValidatorIO class
 */
public class TestExpenseTracker {

    public static void main(String[] args) {
        testExpenseTracker();
    }

    /**
     *
     * @return menu options for a user to choose from
     */
    public static String menu(){
        StringBuilder builder = new StringBuilder();
        builder.append("MENU OPTIONS")
                .append("\n")
                .append("   1. View Transactions")
                .append("\n")
                .append("   2. Add Transactions")
                .append("\n")
                .append("   3. View expense")
                .append("\n")
                .append("Please choose an option:");

        return builder.toString();
    }

    /**
     *
     * Test method to test functionality of TestExpenseTracker application
     */

    public static void testExpenseTracker () {

        while(true) {
            Scanner sc = new Scanner(System.in);
            int input = ValidatorIO.getInt(sc, menu());

            if(1==input){
                try {
                    for (Transaction tran : TransactionIO.findAll()) {
                        System.out.println(tran.toString());
                    }
                }
                catch(IOException e) {
                    System.out.println("\n Exception: "+e.getMessage());
                }
                String usrChoice = ValidatorIO.getString(sc, "Continue? (y/n): ");
                if(usrChoice.equalsIgnoreCase("n")){
                    break;
                }
                else {
                    input = ValidatorIO.getInt(sc, menu());
                }
            }
            else if (input == 2) {
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();

                while(c.equalsIgnoreCase("y")){
                    String description = ValidatorIO.getString(sc, "\n Enter description: ");
                    double amount = ValidatorIO.getDouble(sc, " Enter the amount: ");

                    Transaction transaction = new Transaction(description, amount);
                    transactions.add(transaction);
                    c = ValidatorIO.getString(sc, "\n Enter another transaction? (y/n): ");
                }

                try {
                    TransactionIO.bulkInsert(transactions);
                }
                catch(IOException e) {
                    System.out.println("\n Exception: "+e.getMessage());
                }
            }
            else if (input == 3) {
                try {
                    Double totalTranAmount = 0.0;
                    for (Transaction tran : TransactionIO.findAll()) {
                        totalTranAmount =+ tran.getAmount();
                    }
                    System.out.println("Your total monthly expense is " +totalTranAmount);
                }
                catch(IOException e) {
                    System.out.println("\n Exception: "+e.getMessage());
                }
                String usrChoice = ValidatorIO.getString(sc, "Continue? (y/n): ");
                if(usrChoice.equalsIgnoreCase("n")){
                    break;
                }
                else {
                    input = ValidatorIO.getInt(sc, menu());
                }
            }
        }

    }
}
