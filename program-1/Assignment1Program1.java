import java.util.Random;
import java.util.Scanner;


public class Assignment1Program1 {  
  public static void main(String[] args) {
    System.out.println("          AAA              CCCCCCCCCCCCC");
    System.out.println("         AA AA           CCCC         CCCC");
    System.out.println("        AA   AA         CC");
    System.out.println("       AA     AA        CC");
    System.out.println("      AA       AA       CC");
    System.out.println("     AA         AA      CC");
    System.out.println("    AA           AA     CC");
    System.out.println("   AAAAAAAAAAAAAAAAA    CC");
    System.out.println("  AA               AA   CC");
    System.out.println(" AA                 AA   CCCC         CCCC");
    System.out.println("AA                   AA    CCCCCCCCCCCCC");

    System.out.println(""); // This will create space to tidy up the terminal
    
    //This section will loop until a user enters exactly 5 characters.
    Scanner scanner = new Scanner(System.in);
    String input = "";

    while (input.length() != 5){
      System.out.println("Please enter in 5 characters");
      input = scanner.nextLine();  // Reads a full line of text
    }
    
    String Trimmed = input.substring(1, input.length() - 1);
    String Reversed = new StringBuilder(Trimmed).reverse().toString();

    System.out.println("\nEnter in a number in fahrenheit");
    double tempF = scanner.nextDouble(); // Reads a full line of text
    double tempC = (tempF - 32) * 5 / 9;

    System.out.println("\nGenerating a random number. Continuing...");
    Random rand = new Random();
    int min = 32;
    int max = 16384;
    int randomNum = rand.nextInt(max - min + 1) + min;
    
    System.out.println("\nYour new string is " + tempC + Reversed + randomNum);


    scanner.close();
  }
}
