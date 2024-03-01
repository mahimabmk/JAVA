import java.util.Scanner;

public class numberTriangle {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=console.nextInt();

        for(int i =0; i<=num;i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        console.close();
    }
    
}
