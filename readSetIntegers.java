import java.util.*;

public class readSetIntegers {
    public static void main(String[] args) {
        int num;
        int odd=0, even=0;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number: ");
        num= console.nextInt();

        int remainder = 0;

        while(num>0){
            remainder = num%10;
            if(remainder%2==0){
                even+=remainder;
            }
            else{
                odd+=remainder;
            }
            num/=10;
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        console.close();
    }
}
