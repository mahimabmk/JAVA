import java.util.Scanner;

public class squareHollow {
    public static void main(String[] args) {
        int num;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num= console.nextInt();

        for(int i =0; i<num; i++){
            for(int j=0; j<num; j++){
                if(i==0 || j==0 || i==num-1 || j==num-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        console.close();

    }
    
}
