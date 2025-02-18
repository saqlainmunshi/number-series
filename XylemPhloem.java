
//41.Xylem and Phloem Number
import java.util.Scanner;

class XylemPhloem {

	// check if a number is Xylem
	public static boolean Xylem(int num) {
		if (num < 0) {
			num = num * -1;
		}
		if (num < 100) {
			return true;
		}
		int last = num % 10;
		int sum = 0;
		int temp = num;
		num = num / 10;
		while (num > 10) {
			int dig = num % 10;
			sum += dig;
			num = num / 10;
			
		}

	
		int add = last + num;
		return sum == add;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = keyboard.nextInt();

		// Checking if the number is Xylem
		if (Xylem(num)) {
			System.out.println(num + " is a Xylem Number");
		} else {
			System.out.println(num + " is  a Phloem Number");
		}

	}
}

/*
Enter a number: 12348
12348 is a Xylem Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java XylemPhloem
Enter a number: 12225
12225 is a Xylem Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java XylemPhloem
Enter a number: 825122
825122 is a Xylem Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java XylemPhloem
Enter a number: 761312
761312 is  a Phloem Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java XylemPhloem
Enter a number: 271389
271389 is  a Phloem Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java XylemPhloem
Enter a number: 17156
17156 is  a Phloem Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java XylemPhloem
Enter a number: 143
143 is a Xylem Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java XylemPhloem
Enter a number: 891
891 is a Xylem Numb
*/