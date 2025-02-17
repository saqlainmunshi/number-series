//6.WAP to Generate Multiplication Table

import java.util.Scanner; 

 class MultiplicationTable {

    // Method to generate and print the multiplication table
    public static void printTable(int num) {
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keyboard .nextInt(); 

        // Call the method to print the multiplication table
        printTable(num);
    }
}

/*
Enter a number: 5
Multiplication Table for 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java MultiplicationTable
Enter a number: 0
Multiplication Table for 0:
0 x 1 = 0
0 x 2 = 0
0 x 3 = 0
0 x 4 = 0
0 x 5 = 0
0 x 6 = 0
0 x 7 = 0
0 x 8 = 0
0 x 9 = 0
0 x 10 = 0

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java MultiplicationTable
Enter a number: -56
Multiplication Table for -56:
-56 x 1 = -56
-56 x 2 = -112
-56 x 3 = -168
-56 x 4 = -224
-56 x 5 = -280
-56 x 6 = -336
-56 x 7 = -392
-56 x 8 = -448
-56 x 9 = -504
-56 x 10 = -560
*/