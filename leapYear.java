import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        int year;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter year: ");
        year = console.nextInt();

        if((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))){
            System.out.println("Leap Year");

        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
