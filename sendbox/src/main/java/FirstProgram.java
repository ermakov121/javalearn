import java.sql.SQLOutput;

public class FirstProgram {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        Square s = new Square(8);
        System.out.println("лощадь квадрата со стороной " + s.a + " = " + s.area());
    }
}