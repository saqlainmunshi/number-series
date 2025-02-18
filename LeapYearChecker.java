import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        
    }
}
/*
Enter a year: 2000
2000 is a leap year.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java LeapYearChecker
Enter a year: 1900
1900 is not a leap year.

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java LeapYearChecker
Enter a year: 1904
1904 is a leap year.
*/
