import java.util.*;

public class guessMyNumber {
    public static void main(String[] args) {
        int num;
        int guess;
        int tries=0;
        Scanner console = new Scanner(System.in);

        num = (int) (Math.random() * 100) + 1;

        System.out.println("Guess my number");
        

        do{
            System.out.println("Enter a number: ");
            guess = console.nextInt();

            tries++;

            if(guess>num){
                System.out.println("BIgger number try lower.");
            }
            else if(guess<num){
                System.out.println("lower number, try higher.");
            }
            else{
                System.out.println("correct "+ tries+ " these are the number of tries.");
            }
        }while (guess!=num);

        console.close();


    }
}
