
import java.util.Scanner;

public class IT24100169Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        int digit1 = number / 10000;           // ten-thousands
        int digit2 = (number / 1000) % 10;     // thousands
        int digit3 = (number / 100) % 10;      // hundreds
        int digit4 = (number / 10) % 10;       // tens
        int digit5 = number % 10;              // units

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

        
    }
}