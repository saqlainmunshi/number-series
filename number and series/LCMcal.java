//23.WAP to find LCM of two given numbers.
import java.util.Scanner;

class LCMcal {
    // Method to find LCM of two numbers
    public static int LCM(int a,int b) {
        int last = a*b;  
        for (int i = 1; i < last; i++) {
            if (i%a==0&&i%b== 0) {
                last = i; 
				return last ; 
            }
        }

       return last ; 
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

      
        System.out.print("Enter first number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter second number: ");
        int num2 = keyboard.nextInt();

        // Printing the LCM of the given numbers
        System.out.println("The LCM is = "+LCM(num1, num2));

    }
}
/*
Enter first number: 6
Enter second number: 4
The LCM is = 12

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java LCMcal
Enter first number: 17
Enter second number: 7
The LCM is = 119
*/