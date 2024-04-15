package Module_5.ExpenseTracker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    TransactionIO class
 */
public class TransactionIO {

    private static String FILE_NAME = "expenses.txt";

    private static File file = new File(FILE_NAME);

    /**
     *
     * @param transactions -> Input provided by the user on console that creates a list of transactions
     */
    public static void bulkInsert(List<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        if(file.exists()){
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME),true));
        }
        else {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }
        output.close();
    }

    /**
     *
     * @return the List of Transactions from the text file expenses.txt
     */
    public static List<Transaction> findAll () throws IOException{
        List<Transaction> transactions = new ArrayList<>();
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            Transaction tran = new Transaction();
            String inputString = input.nextLine();
            String[] fileContents = inputString.split(" ");
            tran.setDate(fileContents[0]);
            tran.setDescription(fileContents[1]);
            tran.setAmount((Double.parseDouble(fileContents[2])));
            transactions.add(tran);
        }

        return transactions;
    }
}
