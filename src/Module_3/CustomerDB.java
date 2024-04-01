package Module_3;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
public class CustomerDB {

    /**
     *
     * @param id -> Input provided by the user on console
     * @return Customer object based on user input
     */
    public static Customer getCustomer(Integer id) {

        if(1007 == id) {
            return new Customer("George Underwood","456 N KOP Street","Philadelphia","18975");
        }
        else if(1008 == id) {
            return new Customer("Alex Rook","723 N Avenue","New York","18745");
        }
        else if(1009 == id) {
            return new Customer("Bob Richardson","100 George Street","Newark","13678");
        }
        else {
            return new Customer();
        }
    }
}
