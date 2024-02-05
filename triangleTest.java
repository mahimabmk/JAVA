import java.util.*;

public class triangleTest {
    public static void main(String[] args) {
        int angle1, angle2, angle3;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter first angle: ");
        angle1 = console.nextInt();

        System.out.println("Enter second angle: ");
        angle2 = console.nextInt();

        System.out.println("Enter second angle: ");
        angle3 = console.nextInt();

        if(angle1+angle2+angle3==180){
            System.out.println("It is a triangle.");
        }
        else{
            System.out.println("Not a Triangle");
        }
    }
}
