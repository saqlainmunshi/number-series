//27.WAP to Display Fibonacci series up to a given number 

import java.util.Scanner;

class Fibonacci {
    public static void Fibonaccin(int n) {
        int a = 0, b = 1;
        int f = 0;
        System.out.print("0,1");
        for (int i = 2; i < n; i++) {
            f = a + b;
            System.out.print("," + f);
            a = b;
            b = f;
        }

    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        Fibonaccin(num);

    }

}