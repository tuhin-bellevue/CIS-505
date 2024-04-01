package Module_3;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
public class Account {

    private double balance = 200.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @param amt - double amount to be added with the current balance
     */
    public void deposit (double amt) {
        setBalance(balance+amt);
    }

    /**
     *
     * @param amt - double amount to be withdrawn from the current balance
     */

    public void withdraw (double amt) {
        if(balance>=amt) {
            setBalance(balance-amt);
        }
    }

    /**
     * Provides options for different options such as deposit, withdraw etc
     */
    public void displayMenu () {
        System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");
    }

    /**
     * Return current date as transaction date in MM-dd-yyyy format
     */
    public String getTransactionDate() {
        Date date = new Date();
        Format f = new SimpleDateFormat("MM-dd-yyyy");
        return f.format(date);
    }

}
