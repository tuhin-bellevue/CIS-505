package Module_4.BowlingShopApp;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    This class creates dummy data to mimic DB return
 */
public class ProductDB {

    /**
     *
     * @param code -> Input provided by the user on console
     * @return product queue based on user input
     */
    public static GenericQueue<Product> getProducts(String code){

        GenericQueue<Product> emptyQueue = new GenericQueue<>();

        if(code.equalsIgnoreCase("b")) {

            GenericQueue<Product> balls = new GenericQueue<>();
            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setColor("Black and Red");
            ball1.setDescription("Black widow 2.0");
            ball1.setPrice(144.95);

            Ball ball2 = new Ball();
            ball2.setCode("B101");
            ball2.setColor("Blue and Red");
            ball2.setDescription("Blue widow 2.0");
            ball2.setPrice(145.95);

            Ball ball3 = new Ball();
            ball3.setCode("B102");
            ball3.setColor("White and Red");
            ball3.setDescription("White widow 2.0");
            ball3.setPrice(146.95);

            Ball ball4 = new Ball();
            ball4.setCode("B103");
            ball4.setColor("Pink and Red");
            ball4.setDescription("Pink widow 2.0");
            ball4.setPrice(147.95);

            Ball ball5 = new Ball();
            ball5.setCode("B104");
            ball5.setColor("Green and Red");
            ball5.setDescription("Green widow 2.0");
            ball5.setPrice(148.95);

            balls.enqueue(ball1);
            balls.enqueue(ball2);
            balls.enqueue(ball3);
            balls.enqueue(ball4);
            balls.enqueue(ball5);

            return balls;
        }

        else if(code.equalsIgnoreCase("s")) {

            GenericQueue<Product> shoes = new GenericQueue<>();

            Shoe shoe1 = new Shoe();
            shoe1.setSize(5);
            shoe1.setCode("S1");
            shoe1.setDescription("Shoe Description 1");
            shoe1.setPrice(120.5);

            Shoe shoe2 = new Shoe();
            shoe2.setSize(6);
            shoe2.setCode("S2");
            shoe2.setDescription("Shoe Description 2");
            shoe2.setPrice(125.5);

            Shoe shoe3 = new Shoe();
            shoe3.setSize(7);
            shoe3.setCode("S3");
            shoe3.setDescription("Shoe Description 3");
            shoe3.setPrice(127.5);

            Shoe shoe4 = new Shoe();
            shoe4.setSize(8);
            shoe4.setCode("S4");
            shoe4.setDescription("Shoe Description 4");
            shoe4.setPrice(128.5);

            Shoe shoe5 = new Shoe();
            shoe5.setSize(9);
            shoe5.setCode("S5");
            shoe5.setDescription("Shoe Description 5");
            shoe5.setPrice(130.5);

            shoes.enqueue(shoe1);
            shoes.enqueue(shoe2);
            shoes.enqueue(shoe3);
            shoes.enqueue(shoe4);
            shoes.enqueue(shoe5);

            return shoes;
        }

        else if(code.equalsIgnoreCase("a")) {
            GenericQueue<Product> bags = new GenericQueue<>();

            Bag bag1 = new Bag();
            bag1.setType("bag type 1");
            bag1.setCode("B1");
            bag1.setDescription("Bag description 1");
            bag1.setPrice(120.0);

            Bag bag2 = new Bag();
            bag2.setType("bag type 2");
            bag2.setCode("B2");
            bag2.setDescription("Bag description 2");
            bag2.setPrice(125.0);

            Bag bag3 = new Bag();
            bag3.setType("bag type 3");
            bag3.setCode("B3");
            bag3.setDescription("Bag description 3");
            bag3.setPrice(130.0);

            bags.enqueue(bag1);
            bags.enqueue(bag2);
            bags.enqueue(bag3);

            return bags;
        }

        return emptyQueue;
    }
}

