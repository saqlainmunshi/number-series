//1. WAP to find a Number is Even or Odd
import java.util.Scanner;
class IsEven
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter the Number = ");
		int num = keyboard.nextInt();
		boolean evenodd = IsEven(num);
		if (IsEven(num))
		{
			System.out.print("The Number " + num + " is Even ");
		}else
		{
			System.out.print("The Number " + num + " is Odd ");
		}
	}
	
	// To Find Given Number is Even or Odd
	public static boolean IsEven(int num)
	{ 
		if (num % 2 == 0)
		{
			return true;
		}else 
		{
			return false;
		}
	}
}



/*
Enter the Number =
23
The Number 23 is Odd

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java IsEven
Enter the Number =
54
The Number 54 is Even


C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java IsEven
Enter the Number =
-56
The Number -56 is Even



C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java IsEven
Enter the Number =
-3
The Number -3 is Odd

*/