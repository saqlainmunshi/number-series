//33.Special 2-digit number
import java.util.Scanner;

class SpecialTwoDigitNumber {

    // Method to check if a number is a Special 2 digit Number
    static boolean isSpecialNumber(int num) {
        if (num < 10 || num > 99) {
            return false; 
        }

        int digit1 = num / 10; 
        int digit2 = num % 10; 

        int sum = digit1 + digit2;
        int product = digit1 * digit2;

        return (sum + product) == num;
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = keyboard.nextInt();
       

        if (isSpecialNumber(number)) {
            System.out.println(number + " is a Special Two  Digit Number");
        } else {
            System.out.println(number + " is not a Special Two Digit Number");
        }
    }
}
/*
Enter a two digit number: 59
59 is a Special Two-Digit Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java SpecialTwoDigitNumber
Enter a two digit number: 81
81 is not a Special Two-Digit Number
*/