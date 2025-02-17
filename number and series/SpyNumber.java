//32.Spy Number

import java.util.Scanner;

 class SpyNumber {

    // Method to check if a number is a Spy Number
    static boolean isSpyNumber(int num) {
        int sum = 0, product = 1, temp = num;

        while (temp > 0) {
            int digit = temp % 10; 
            sum += digit; 
            product *= digit; 
            temp /= 10; 
        }

        return sum == product; 
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
       

        if (isSpyNumber(number)) {
            System.out.println(number + " is a Spy Number");
        } else {
            System.out.println(number + " is not a Spy Number");
        }
    }
}
/*
Enter a number: 1124
1124 is a Spy Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java SpyNumber
Enter a number: 24552
24552 is not a Spy Number.
*/