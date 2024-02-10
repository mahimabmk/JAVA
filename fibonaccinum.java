import java.util.*;

public class fibonaccinum {
    public static void main(String[] args) {
        int num;
        int first=0;
        int second=1;
        int next;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = console.nextInt();

        System.out.println(first+ " ");
        System.out.println(second+ " ");

        for(int i=3; i<=num; i++){
            next= first+second;
            System.out.println(next+ " ");
            first = second;
            second= next;
        }
    }
}
