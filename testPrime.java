import java.util.*;

public class testPrime {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);

        System.out.println("enter a number: ");
        num = console.nextInt();

        int count = 0;

        for(int i =1; i<=num ; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count<=2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        console.close();
    }
}
