//29.Strontio Number
import java.util.Scanner;

class StrontioN {

    //check if a number is Strontio
    public static boolean Strontio(int num) {
	
        if(num>999&&num<=9999){
		int n = num*2;
		n=n/10;
		int a = n%10;
		n=n/10;
		int b = n%10;
		
		if(a==b){
		return true;
		}else{
		return false;
		}
		}
		else{
       return false;}
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = keyboard .nextInt();

      // Checking if the number is Strontio
        if (Strontio(num)) {
            System.out.println(num+ " is a Strontio Number");
        } else {
            System.out.println(num +" is NOT a Strontio Number");
        }

        
    }
}


/*
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java StrontioN
Enter a number: 1386
1386 is a Strontio Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java StrontioN
Enter a number: 1221
1221 is a Strontio Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java StrontioN
Enter a number: 1252
1252 is NOT a Strontio Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java StrontioN
Enter a number: 8453
8453 is NOT a Strontio Number

Enter a number: 67
67 is NOT a Strontio Number
*/