import java.util.Scanner;

public class zeroOneTriangle {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num= console.nextInt();

        for(int i=0; i<=num;i++){
            for(int j=1; j<=num-i;j++){
            }
            for(int j=1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+" ");
                }
                
            }
            System.out.println(" ");
        }
        console.close();
    }
}
