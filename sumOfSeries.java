import java.util.*;

public class sumOfSeries {
    public static void main(String[] args) {
        int num;
        double sum =0;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = console.nextInt();

        for(int i =1; i<=num; i++){
            sum += 1.0/i;
        }

        System.out.println(sum);
    }
}
