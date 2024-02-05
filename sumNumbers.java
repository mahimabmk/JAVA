import java.util.*;

public class sumNumbers {
    public static void main(String[] args) {
        int num;
        int sum=0;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num=console.nextInt();

        for(int i=1; i<=num; i++){
            sum= sum+i;
        }

        System.out.println(sum);
    

        console.close();
    }
    
}
