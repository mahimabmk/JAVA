import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int num;
        int sum=1;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num=console.nextInt();

        for(int i=num; i>=1; i--){
            sum= sum*i;
        }
        System.out.println(sum);

    

        console.close();
    }
    
}
