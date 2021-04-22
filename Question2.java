import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter height in meter(m):");
    double height = in.nextDouble();
    //System.out.print("Enter weight in kilogram(kg):");
    double weight = in.nextDouble();
    //System.out.println("Calculating user BMI");
    double bmi = weight / (height* height);
    //System.out.print("The BMI of the user is " + bmi + "kg/m2");
  }
}
