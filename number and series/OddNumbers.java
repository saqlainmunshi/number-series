// 3.WAP to Display Odd Numbers From 1 to N
import java.util.Scanner; 
class OddNumbers {
    
    // Method to print even numbers from 1 to n
    public static void printEvenNumbers(int n) {
        System.out.println("Even numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i += 2) { 
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
      
        Scanner keyboard  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = keyboard .nextInt(); 

        // Call the method to print even numbers
		if(n>0){
        printEvenNumbers(n);
		}else{
			System.out.print("Enter a positive number");

		}
    }
}




/*
Enter a number: 145
Even numbers from 1 to 145 are:
1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 101 103 105 107 109 111 113 115 117 119 121 123 125 127 129 131 133 135 137 139 141 143 145

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java OddNumbers
Enter a number: -56
Enter a positive number
*/