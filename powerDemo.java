import java.util.*;

public class powerDemo {
    public static void main(String[] args) {
        int num, pow;
        int result=1;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = console.nextInt();

        System.out.println("Enter power of number: ");
        pow = console.nextInt();

        for(int i=1; i<=pow; i++){
            result = result * num;
        }
        System.out.println(result);
        console.close();
    }
}
