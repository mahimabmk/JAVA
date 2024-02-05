import java.util.*;

public class reverseNum {
    public static void main(String[] args) {
        int num;
        int reverse=0;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = console.nextInt();

        int temp = num;
        int remainder = 0;

        while(temp>0){
            remainder = temp % 10;
	        reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.println(reverse);
        console.close();
    }
}
