//11.WAP to find given number is Buzz Number or not

import java.util.Scanner;

class BuzzNumberCheck {

    // Method to check if a number is a Buzz Number
    public static boolean isBuzzNumber(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in); 
        
        
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt(); 
		
        // Check if it's a Buzz Number and display result
        if (isBuzzNumber(num)) {
            System.out.println(num + " is a Buzz Number");
        } else {
            System.out.println(num + " is NOT a Buzz Number");
        }

        
    }
}



/*
Enter a number: 23
23 is NOT a Buzz Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java BuzzNumberCheck
Enter a number: 49
49 is a Buzz Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java BuzzNumberCheck
Enter a number: 17
17 is a Buzz Number.
*/