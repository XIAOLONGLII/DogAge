import java.util.Scanner;

/* Program that has a conversation with the user. Uses a switch statement
   and a random number (sort of) to mix up the program's responses. */

public class Conversation {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int randNum0_3 = 0;   // Random number 0 to 3
      String userText = ""; // User input

      System.out.print("Tell me something about yourself. ");
      System.out.println("You can type \"Goodbye\" at anytime to quit.\n");
      System.out.print("> ");

      userText = scnr.nextLine();

      while (!userText.equals("Goodbye")) {
         randNum0_3 = userText.length() % 4; // "Random" num. %4 ensures 0-3
         switch (randNum0_3) {
            case 0:
               System.out.println("\nPlease explain further.\n");
               System.out.print("> ");
               break;

            case 1:
               System.out.println("\nWhy do you say: \"" + userText + "\"?\n");
               System.out.print("> ");
               break;

            case 2:
               System.out.println("\nI don't think that's right.\n");
               System.out.print("> ");
               break;

            case 3:
               System.out.println("\nWhat else can you share?\n");
               System.out.print("> ");
               break;

            default:
               System.out.println("\nUh-oh, something went wrong. Try again.\n");
         }

         userText = scnr.nextLine();
      }

      System.out.println("\nIt was nice talking with you. Goodbye.\n");

      return;
   }
}
