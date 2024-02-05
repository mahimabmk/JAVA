import java.util.*;

public class table {
    public static void main(String[] args) {
        int num;
        int sum=0;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num=console.nextInt();

        for(int i=1; i<=10; i++){
            sum= num*i;
            System.out.println(sum);
        }

    

        console.close();
    }
    
}
