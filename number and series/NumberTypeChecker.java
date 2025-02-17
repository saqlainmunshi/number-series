
// 38.Increasing Number 39.Decreasing Number 40.Bouncing Number
import java.util.Scanner;

class NumberTypeChecker {

    static boolean isIncreasing(int num) {
        int a = 0, b = 0;
        while (num > 10) {
            a = num % 10;
			num=num/10;
            b = num % 10;
			
			
            if (a < b) {
                return false;
            }
            

        }

        return true;
    }

    static boolean isDecreasing(int num) {
        int a = 0, b = 0;
        while (num > 10) {
           a = num % 10;
			num=num/10;
            b = num % 10;
            if (a > b) {
                return false;
            }
           

        }
        return true;
    }

    // Method to determine the type of number
    static void checkNumberType(int num) {
        if (isIncreasing(num)) {
            System.out.println(num + " is an Increasing Number");
        } else if (isDecreasing(num)) {
            System.out.println(num + " is a Decreasing Number");
        } else {
            System.out.println(num + " is a Bouncing Number");
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();

        checkNumberType(number);
    }

}



/*
Enter a number: 4321
4321 is a Decreasing Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NumberTypeChecker
Enter a number: 0123
123 is an Increasing Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NumberTypeChecker
Enter a number: 3210
3210 is a Decreasing Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NumberTypeChecker
Enter a number: 3917
3917 is an Increasing Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>javac NumberTypeChecker.java

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NumberTypeChecker
Enter a number: 1234
1234 is an Increasing Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NumberTypeChecker
Enter a number: 4321
4321 is a Decreasing Number.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java NumberTypeChecker
Enter a number: 9386
9386 is a Bouncing Number.
*/