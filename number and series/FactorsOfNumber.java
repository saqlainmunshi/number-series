//22.WAP to find Factors of given number

import java.util.Scanner;

class FactorsOfNumber {

    // find  factors of a number
    public static void findFactors(int num) {
        System.out.print("Factors of "+ num+" are: ");
        for (int i= 1; i <= num ; i++) {
            if (num %i ==0) { 
                System.out.print(i+" ");
            }
        }
       
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = keyboard .nextInt();

        // Method call
        findFactors(num);

    }
}



/*
Enter a number: 12
Factors of 12 are: 1 2 3 4 6 12

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java FactorsOfNumber
Enter a number: 15
Factors of 15 are: 1 3 5 15

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java FactorsOfNumber
Enter a number: 9
Factors of 9 are: 1 3 9

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java FactorsOfNumber
Enter a number: 17
Factors of 17 are: 1 17
*/
