import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        int a,b,c;
        int num;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = console.nextInt();

        System.out.println("Enter the second number: ");
        b = console.nextInt();

        System.out.println("Enter the third number: ");
        c = console.nextInt();

        System.out.println("The largest number is: ");

        if(a>b){
            if(a>c){
                num = a;
            }
            else{
                num = c;
            }
        }
        else{
            if(b>c){
                num = b;
            }
            else{
                num = c;
            }
        
        }
        System.out.println(num);
        console.close();
    }
}
