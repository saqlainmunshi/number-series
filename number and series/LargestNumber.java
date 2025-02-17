//5.WAP to Find Largest of Three Numbers

import java.util.Scanner; 
class LargestNumber {

    // Method to find the largest of three numbers
    public static void findLargest(int num1, int num2, int num3) {

        
        
        if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is: " + num1);

        } else if (num2 > num1 && num2 > num3) {
        System.out.println("The largest number is: " + num2);
        }else if (num3 > num1 && num3 > num2) {
        System.out.println("The largest number is: " + num3);
        } else {
           System.out.print("two or more variable are same");

        }
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = keyboard .nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = keyboard .nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = keyboard .nextInt();

        // Call the method to find the largest number
        findLargest(num1, num2, num3);

       
		   
	   

        
    }
}
/*
Enter first number: 23
Enter second number: 34
Enter third number: 78
The largest number is: 78

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java LargestNumber
Enter first number: -67
Enter second number: -98
Enter third number: 0
The largest number is: 0

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java LargestNumber
Enter first number: 23
Enter second number: 23
Enter third number: 9
two or more variable are same
*/