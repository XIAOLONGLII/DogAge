
import java.util.Scanner;

public class PhoneNumberDecoder {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      String phoneStr = "";  // User input: Phone number string
	      int i = 0;             // Current index in phone number string
	      char currChar = '_';   // Current char in phone number string

	      System.out.print("Enter phone number: ");
	      phoneStr = scnr.next();

	      System.out.print("Numbers only: ");

	      for (i = 0; i < phoneStr.length(); ++i) { // For each element
	         currChar = phoneStr.charAt(i);
	         if ((currChar >= '0') && (currChar <= '9')) {
	            System.out.print(currChar); // Print character as is
	         }
	         // FIXME: Add else-if branches for letters and hyphen
	         else if((currChar!='0')||(currChar!='9')){
	        	 
	            System.out.print('?');
	         }
	      }
	      
	      System.out.println("");
	      return;
	   }
}