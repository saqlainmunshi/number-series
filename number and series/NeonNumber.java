//34.Neon Number
import java.util.Scanner;

class NeonNumber {

    // Method to check if a number is Neon
    static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10; 
            square /= 10; 
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard .nextInt();
        
        if (isNeon(number)) {
            System.out.println(number + " is a Neon Number");
        } else {
            System.out.println(number + " is not a Neon Number");
        }
    }
}
/*
Enter a number: 81
81 is not a Neon Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NeonNumber
Enter a number: 9
9 is a Neon Number.
*/