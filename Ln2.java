import java.util.*;

public class Ln2 {
    public static void main(String[] args) {
        int num;
        double sum =0;

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = console.nextInt();

        for(int i =1; i<=num; i++){
            if(i%2==0){
                sum-=1.0/i;
            }
            else{
                sum+=1.0/i;
            }
        }

        System.out.println(sum);

        console.close();
    }
}
