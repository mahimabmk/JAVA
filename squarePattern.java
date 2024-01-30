import java.util.*;

public class squarePattern{
  public static void main(String[] args){
    System.out.println("Enter a number:");
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int i,j;
    for(i=0; i<num;i++){
      for(j=0;j<num;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}