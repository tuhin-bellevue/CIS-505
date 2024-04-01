package Module_3;

import java.util.Scanner;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Java class with main method to test class Customer, Account and CustomerDB
 */
public class TestCustomerAccountApp {

    /**
     * Main method to test functionality of Customer, CustomerDB and Account class.
     * This method takes user input as customer ID as in Integer and operation type as String
     * and display customer detail along with balance and date
     * User can continue as many times as they want and also have the ability to quit
     */
    public static void main(String[] args) {
        boolean continueLoop = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Customer Account App");
            System.out.println("Enter a Customer ID:");
            System.out.println("   ex:1007,1008,1009>:");
            Integer custId = scanner.nextInt();
            Customer customer = CustomerDB.getCustomer(custId);
            Account account = new Account();
            account.displayMenu();
            System.out.println("Enter option>:");
            String customerOption = scanner.next();

            if("d".equals(customerOption)){
                System.out.println("Enter deposit amount ");
                String depositAmount = scanner.next();
                account.deposit(Double.parseDouble(depositAmount));
            }
            else if("w".equals(customerOption)){
                System.out.println("Enter withdraw amount ");
                String withdrawAmount = scanner.next();
                account.withdraw(Double.parseDouble(withdrawAmount));
            }
            else {
                System.out.println("Error: Invalid Option.");
            }
            System.out.println(customer);
            System.out.println("Balance as of "+account.getTransactionDate() + " is $"+account.getBalance());
            System.out.println("Continue ? (y/n):");
            String userSelection = scanner.next();
            if("y".equalsIgnoreCase(userSelection)){
                continueLoop = true;
            }
        }
        while (continueLoop);
    }
}
