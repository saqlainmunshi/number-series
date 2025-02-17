
//16.Narcissistic number 15.WAP to Check Armstrong Number
import java.util.Scanner;

 class NarcissisticNumber {
    
    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to calculate power manually (base^exp)
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    // Method to check if a number is Narcissistic
    public static boolean isNarcissistic(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = countDigits(num);

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digitCount);
            temp /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = keyboard .nextInt();

        // Checking if it's a Narcissistic number
        if (isNarcissistic(num)) {
            System.out.println(num + " is a Narcissistic Number");
        } else {
            System.out.println(num + " is NOT a Narcissistic Number");
        }

        
    }
}


/* 
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NarcissisticNumber
Enter a number: 456
456 is NOT a Narcissistic Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NarcissisticNumber
Enter a number: 153
153 is a Narcissistic Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NarcissisticNumber
Enter a number: 1634
1634 is a Narcissistic Number.
*/