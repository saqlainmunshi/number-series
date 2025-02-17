//4.WAP to swap 2 numbers with 3 variables.
import java.util.Scanner;
 
class SwapNumbers {

    // Method to swap two numbers using a third variable
    public static void swapNumbers(int num1, int num2) {
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        int temp = num1; 
        num1 = num2;    
        num2 = temp;  

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = keyboard .nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = keyboard .nextInt();

        // Call the method to swap numbers
        swapNumbers(num1, num2);

    }
}

/*
Enter first number: 23
Enter second number: 56
Before swapping: num1 = 23, num2 = 56
After swapping: num1 = 56, num2 = 23

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java SwapNumbers
Enter first number: -45
Enter second number: 0
Before swapping: num1 = -45, num2 = 0
After swapping: num1 = 0, num2 = -45

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java SwapNumbers
Enter first number: -45
Enter second number: -67
Before swapping: num1 = -45, num2 = -67
After swapping: num1 = -67, num2 = -45
*/
