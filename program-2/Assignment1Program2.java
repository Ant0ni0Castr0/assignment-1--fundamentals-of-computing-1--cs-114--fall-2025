import java.util.Scanner;
import java.lang.Math;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Base Conversion Program \n" );

    System.out.print("Please enter a base (2-9): ");
    int base = scanner.nextInt();
    int maxDigit = base - 1;
    double position4Value = maxDigit * Math.pow(base, 3);
    double position3Value = maxDigit * Math.pow(base, 2);
    double position2Value = maxDigit * base;
    double position1Value = maxDigit;
    int max4DigitNum = (int)(position4Value + position3Value 
                          + position2Value + position1Value);

    System.out.println("\nThe maximum, 4-digit, base 10 number in base " + base  
      + " is " + max4DigitNum);
    
    System.out.print("Now enter in a base 10 number in the range 0 to "
    + max4DigitNum + " to convert: ");
    
    int base10Num = scanner.nextInt();

    int firstDivision = base10Num / base;
    int firstRemainder = base10Num % base;
    int secondDivison = firstDivision / base;
    int secondRemainder = firstDivision % base;
    int thirdDivision = secondDivison / base;
    int thirdRemainder = secondDivison % base;
    int fourthRemainder = thirdDivision % base;

    System.out.println("\n" + base10Num + " (base 10) = " + fourthRemainder 
    + thirdRemainder + secondRemainder + firstRemainder + " (base " + base + ")"); 
    
    scanner.close();
    
    
  }
}
