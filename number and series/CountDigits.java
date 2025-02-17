// 14.WAP to Count Number of Digits in an Integer

import java.util.Scanner;

class CountDigits {

    // count the number of digits in an integer
    public static int countDigits(int num) {
        int count = 0;

        if (num == 0) {
            return 1;
        } else if (num < 0) {
            num = num * -1;
        }

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();

        // Call method to count digits
        System.out.println("Number of digits: " + countDigits(num));

    }
}
/*
 * Enter a number: 1234
 * Number of digits: 4
 * 
 * C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and
 * series>java CountDigits
 * Enter a number: 65435578937596798375893
 * Exception in thread "main" java.util.InputMismatchException: For input
 * string: "65435578937596798375893"
 * at java.util.Scanner.nextInt(Scanner.java:2123)
 * at java.util.Scanner.nextInt(Scanner.java:2076)
 * at CountDigits.main(CountDigits.java:28)
 * 
 * C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and
 * series>java CountDigits
 * Enter a number: 583983506
 * Number of digits: 9
 * 
 * C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and
 * series>java CountDigits
 * Enter a number: -583983506
 * Number of digits: 9
 * 
 * C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and
 * series>java CountDigits
 * Enter a number: 0
 * Number of digits: 1
 */