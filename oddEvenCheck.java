import java.util.*;

public class oddEvenCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if(num%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }

        scn.close();

    }
}
