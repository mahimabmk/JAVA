import java.util.*;

public class reverseRightPyramid {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num= console.nextInt();

        for(int i=num; i>=1 ; i--){
            for(int j=1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        console.close();
    }
}
