//30.Krishnamurthy Number
import java.util.Scanner;

class KrishnamurthyNumber {

    // Method to calculate factorial of a digit
    static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is Krishnamurthy
    static boolean isKrishnamurthy(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard .nextInt();
   

        if (isKrishnamurthy(number)) {
            System.out.println(number + " is a Krishnamurthy Number");
        } else {
            System.out.println(number + " is not a Krishnamurthy Number");
        }
    }
}

/*
 C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java KrishnamurthyNumber
Enter a number: 145
145 is a Krishnamurthy Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java KrishnamurthyNumber
Enter a number: 25
25 is not a Krishnamurthy Number.
 */