import java.util.Scanner;

/**
 * This program calculates the intergers factorial value
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Variables for number, the factorial, and accumulator variable
    int i, num, fac = 1;

    //asks the user to enter the interger to calculate
    System.out.println("Please enter an integer to calculate the factorial of");
    //allows user to enter the interger to calculate
    num = input.nextInt();
  
    //calculates the interger
    for(i = 1; i <= num; i++){
      fac = fac * i;
    }
    System.out.println(num + "! = " + fac);

    
  }
}
