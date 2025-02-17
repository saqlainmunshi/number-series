// 12.How to Reverse a Number in Java?
 import java.util.Scanner; 

class ReverseNumber {

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0; 

        while (num != 0) { 
            int digit = num % 10; 
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return reversed; 
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in); 
        
        
        System.out.print("Enter a number: ");
        int num = keyboard .nextInt(); 
        
        // call method to reverse the number
        System.out.println("Reversed Number: " + reverseNumber(num));

        
    }
}
/* 
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java ReverseNumber
Enter a number: 2445
Reversed Number: 5442

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java ReverseNumber
Enter a number: 0975
Reversed Number: 579

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java ReverseNumber
Enter a number: 1045
Reversed Number: 5401

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java ReverseNumber
Enter a number: 1000
Reversed Number: 1
*/