//26.WAP to Find Factorial of a Number (Using Recursion)
import java.util.Scanner;

class FactorialR {
	//to Find Factorial of a Number (Using Recursion)
    public static int Factorialn(int n) {
        if(n == 0){
		return 1;
		}
	    else{
	    return Factorialn(n-1)*n;
	    }

    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
		    System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        System.out.println("The sum is =" + Factorialn(num));

    }

}



/*
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Factorial
Enter a number: 5
The sum is =120

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Factorial
Enter a number: 10
The sum is =3628800

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Factorial
Enter a number: 3
The sum is =6

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Factorial
Enter a number: 0
The sum is =1
*/