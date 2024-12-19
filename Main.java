import javax.swing.JOptionPane;

/*
DD:
double miles
double gallons
double mpg
String input

Ask user for number of miles
Read input into miles
Ask user for gallons of gas used
Read input into gallons
Calculate mpg as miles / gallons
Display miles per gallon
*/

public class Main
{
   public static void main(String[] args)
   {
      double miles;        // Miles driven
      double gallons;      // Gallons of fuel
      double mpg;          // Miles-per-gallon
      String input;        // To hold keyboard input
      
      // Get the miles driven.
      input = JOptionPane.showInputDialog("Enter the miles driven: ");
      miles = Double.parseDouble(input);
      
      // Get the number of gallons of fuel.
      input = JOptionPane.showInputDialog("Enter the gallons of fuel used: ");
      gallons = Double.parseDouble(input);
      
      // Calculate the miles-per-gallon.
      mpg = miles / gallons;
      
      // Display the miles-per-gallon.
      JOptionPane.showMessageDialog(null, "The miles-per-gallon is " + mpg);
      
      // Exit the program.
      System.exit(0);
   }
}
