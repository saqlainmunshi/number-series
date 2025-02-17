//27.WAP to Display Fibonacci series up to a given number 

import java.util.Scanner;

class Fibonacci {
    public static void Fibonaccin(int n) {
        int a = 0, b = 1;
        int f = 0;
		if(n==1){
			        System.out.print("0");

		}else if(n==2){
			System.out.print("0,1");
		}
        else{
			System.out.print("0,1");
        for (int i = 2; i < n; i++) {
            f = a + b;
            System.out.print("," + f);
            a = b;
            b = f;
        }
		}
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        Fibonaccin(num);

    }

}
/*
Enter a number: 10
Enter a number: 10
0,1,1,2,3,5,8,13,21,34
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Fibonacci
Enter a number: 1
0
*/