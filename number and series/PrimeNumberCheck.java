//21.How to find Prime Number in Java?
import java.util.Scanner;

class PrimeNumberCheck {

    //check if a number is prime
    public static boolean isPrime(int num) {
        
        if (num <=1) {
            return false;
        }

        
        for (int i=2; i *i<= num;i++) {
            if (num % i== 0) { 
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = keyboard .nextInt();

      // Checking if the number is prime
        if (isPrime(num)) {
            System.out.println(num+ " is a Prime Number");
        } else {
            System.out.println(num +" is NOT a Prime Number");
        }

        
    }
}


/*
Enter a number: 23
23 is a Prime Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java PrimeNumberCheck
Enter a number: 4
4 is NOT a Prime Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java PrimeNumberCheck
Enter a number: 1
1 is NOT a Prime Number
*/