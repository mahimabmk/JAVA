import java.util.*;

public class printNumbers {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=console.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    

        console.close();
    }
    
}
