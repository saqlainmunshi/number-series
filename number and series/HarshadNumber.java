//31.Harshad number
import java.util.Scanner;

class HarshadNumber {

    // Method to check if a number is Harshad
    static boolean isHarshad(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10; 
        }

        return num % sum == 0; 
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard .nextInt();
     

        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
/* 

Enter a number: 156
156 is a Harshad Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java HarshadNumber
Enter a number: 24
24 is a Harshad Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java HarshadNumber
Enter a number: 75
75 is not a Harshad Number.*/