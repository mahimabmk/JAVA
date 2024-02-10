import java.util.*;

public class findMaxMin {
    public static void main(String[] args) {
        int num;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        char choice;

        Scanner console = new Scanner(System.in);

        do{
            System.out.println("Enter number: ");
            num= console.nextInt();

            if(num>max){
                max = num;
            }
            else if(num<min){
                min = num;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        }while(choice=='y' || choice == 'Y');

        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }
}
