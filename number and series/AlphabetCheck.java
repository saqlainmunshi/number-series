//19.WAP to check whether a character is an English Alphabet (UPPER & lower case) or Not

import java.util.Scanner;

class AlphabetCheck {

    // check if a character is an uppercase letter
    public static boolean isUpperCase(char ch) {
        // System.out.println('A'+1);
        return (ch >= 'A' && ch <= 'Z');
    }

    // check if a character is a lowercase letter
    public static boolean isLowerCase(char ch) {
        return (ch >= 'a' && ch <= 'z');
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = keyboard.next().charAt(0);

        // Checking the type of character
        if (isUpperCase(ch)) {
            System.out.println(ch + " is an English Alphabet (Uppercase)");
        } else if (isLowerCase(ch)) {
            System.out.println(ch + " is an English Alphabet (Lowercase)");
        } else {
            System.out.println(ch + " is not an English Alphabet");
        }

    }
}
/*
 * Enter a character: a
 * a is an English Alphabet (Lowercase)
 * 
 * C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and
 * series>java AlphabetCheck
 * Enter a character: A
 * A is an English Alphabet (Uppercase)
 * 
 * C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and
 * series>java AlphabetCheck
 * Enter a character: 1
 * 1 is not an English Alphabet
 * 
 * C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and
 * series>java AlphabetCheck
 * Enter a character: &
 * & is not an English Alphabet
 */