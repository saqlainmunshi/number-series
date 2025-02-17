//13.Palindrome Number
import java.util.Scanner;

class PalindromeNumber {

    // check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num; 
        int reversed = 0; 

        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit;
            num /= 10; 
        }

       
        return originalNum == reversed;
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        int num = keyboard .nextInt(); 
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is NOT a Palindrome Number.");
        }

    }
}
/*
Enter a number: 1221
1221 is a Palindrome Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java PalindromeNumber
Enter a number: 4214
4214 is NOT a Palindrome Number.

Enter a number: -9009
-9009 is a Palindrome Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java PalindromeNumber
Enter a number: -864
-864 is NOT a Palindrome Number
*/