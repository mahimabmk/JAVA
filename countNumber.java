import java.util.*;

public class countNumber {
    public static void main(String[] args) {
        int num;
        int positive=0;
        int negative=0;
        int zero=0;
        char choice;
        Scanner console = new Scanner(System.in);

       do{
         System.out.println("enter a number: ");
        num = console.nextInt();

        if(num==0){
            zero++;
        }
        else if(num>0){
            positive++;
        }
        else{
            negative++;
        }
        System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
       }while(choice=='y' || choice == 'Y');

        System.out.println("Zero: "+zero);
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
    }
}
