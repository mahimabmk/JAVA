import java.util.*;

public class positiveNegativeZero {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");

        num= console.nextInt();

        if(num<0){
            System.out.println("Negative");
        }
        else if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }

        
    }
}
