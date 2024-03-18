package Module_1.HelloWorlApp;

public class TestFanApp {

    public static void main (String[] args) {
        Fan defaultFan = new Fan();
        System.out.println(defaultFan);

        Fan anotherFan = new Fan(2, true, 8.0, "Blue" );
        System.out.println(anotherFan);
    }
}
