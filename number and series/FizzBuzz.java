// 10.FizzBuzz Program in Java

import java.util.Scanner; 

class FizzBuzz{

    // Method to print FizzBuzz from 1 to n
    public static void printFizzBuzz(int n) {
        
            // Check divisibility conditions
            if (n % 3 == 0 && n % 5 == 0) { 
                System.out.println("FizzBuzz"); 
            } else if (n % 3 == 0) { 
                System.out.println("Fizz"); 
            } else if (n % 5 == 0) { 
                System.out.println("Buzz"); 
            } else {
                System.out.println(n); 
            }
        
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in); 

      
        System.out.print("Enter a number: ");
        int n = keyboard .nextInt(); 
		
		
        // Call the method to print FizzBuzz
        printFizzBuzz(n);

      
    }
}
/*
Enter a number: 23
23

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java FizzBuzz
Enter a number: 9
Fizz

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java FizzBuzz
Enter a number: 20
Buzz

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java FizzBuzz
Enter a number: 15
FizzBuzz
*/
