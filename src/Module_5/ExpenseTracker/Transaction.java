package Module_5.ExpenseTracker;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Transaction class
 */
public class Transaction {

    private String date;
    private String description;
    private double amount = 0.0;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction(){
    }

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
        Date curentDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        this.date = simpleDateFormat.format(curentDate);
    }

    @Override
    public String toString() {
        return "---Monthly Expenses---"+ "\n" +
                "date:" + date + "\n" +
                "description:" + description + "\n" +
                "amount: " + "$ "+ amount + "\n";
    }
}
