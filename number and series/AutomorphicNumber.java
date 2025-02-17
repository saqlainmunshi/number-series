//35.	Automorphic number
import java.util.Scanner;

class AutomorphicNumber {

    // Method to check if a number is Automorphic
    static boolean Automorphic(int num) {
        int square = num * num;
        int temp = num;

        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
 

        if (Automorphic(number)) {
            System.out.println(number + " is an Automorphic Number");
        } else {
            System.out.println(number + " is not an Automorphic Number");
        }
    }
}
/*
Enter a number: 25
25 is an Automorphic Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java AutomorphicNumber
Enter a number: 7
7 is not an Automorphic Number.
*/