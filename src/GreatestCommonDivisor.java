import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();
    int temp;
    
    while (n2 != 0){
      temp = n2;
      n2 = n1 % n2;
      n1 = temp;
    } // while
    
    System.out.println("The greatest common divisor is " + n1);
  }  // main
} // GreatestCommonDivisor
