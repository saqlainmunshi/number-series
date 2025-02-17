import java.util.Scanner;

class SwapNumbers2 {

    // Method to swap two number
    public static void swapnumber(int num1, int num2) {
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 + num2; 
        num2 = num1 - num2; 
        num1 = num1 - num2; 

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = keyboard .nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = keyboard .nextInt();
		
		// call the method to swap numbers
        swapnumber(num1, num2);

        
    }
}


/*
Enter first number: 23
Enter second number: 34
Before swapping: num1 = 23, num2 = 34
After swapping: num1 = 34, num2 = 23

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java SwapNumbers2
Enter first number: -34
Enter second number: 0
Before swapping: num1 = -34, num2 = 0
After swapping: num1 = 0, num2 = -34

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java SwapNumbers2
Enter first number: -56
Enter second number: -78
Before swapping: num1 = -56, num2 = -78
After swapping: num1 = -78, num2 = -56
*/