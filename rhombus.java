import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num= console.nextInt();

        for(int i=0;i<=num;i++){
            for(int j=0; j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    
}
