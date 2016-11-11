import java.util.Scanner;

public class AncestorsPrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int YEARS_PER_GEN = 20; // Approx. years per generation
      int userYear = 0;             // User input
      int consYear = 0;             // Year being considered
      int numAnc = 0;               // Approx. ancestors in considered year

      System.out.print("Enter a past year (neg. for B.C.): ");
      userYear = scnr.nextInt();

      consYear = 2020;
      numAnc = 2;
      while (consYear >= userYear) {
         System.out.println("Ancestors in " + consYear +": " + numAnc);

         numAnc = 2 * numAnc;                 // Each ancestor had two parents
         consYear = consYear - YEARS_PER_GEN; // Go back 1 generation
      }
      
      return;
   }
}
