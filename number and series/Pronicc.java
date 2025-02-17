//28.Pronic/Heteromecic Number
import java.util.Scanner;

class Pronicc {

    //check if a number is Pronic
    public static boolean Pronic(int num) {
	
        for(int i=0;i*(i+1)<=num;i++){
		 if(num==(i*(i+1))){
		 return true;
		 }
		}
       return false;
    }

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = keyboard .nextInt();

      // Checking if the number is Pronic
        if (Pronic(num)) {
            System.out.println(num+ " is a Pronic Number");
        } else {
            System.out.println(num +" is NOT a Pronic Number");
        }

        
    }
}


/*
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Pronicc
Enter a number: 6
6 is a Pronic Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Pronicc
Enter a number: 30
30 is a Pronic Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Pronicc
Enter a number: 0
0 is a Pronic Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java Pronicc
Enter a number: 64
64 is NOT a Pronic Number
*/