//23.WAP to find HCF of two given numbers.
import java.util.Scanner;

class HCFcal {
    // Method to find HCF of two numbers
    public static int HCF(int a,int b) {
        int last = 0;  
        int result=0; 

        // find the smaller number
        if (a > b) 
		{
            last = b;
        }else{
            last =a;
        }


        for (int i = 1; i <= last; i++) {
            if (a%i==0&&b%i== 0) {
                result = i; 
            }
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

      
        System.out.print("Enter first number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter second number: ");
        int num2 = keyboard.nextInt();

        // Printing the HCF of the given numbers
        System.out.println("The HCF is = "+HCF(num1, num2));

    }
}
/*
Enter first number: 12
Enter second number: 36
The HCF is = 12

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java HCFcal
Enter first number: 67
Enter second number: 33
The HCF is = 1
*/