import java.util.*;

public class rightHalfPyramid {
    public static void main(String[] args) {
        int num;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = console.nextInt();

        for(int i=1; i<=num ;i++){
            for( int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        console.close();
    }
}
