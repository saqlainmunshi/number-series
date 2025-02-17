
// 17.Disarium number
import java.util.Scanner;

class DisariumNumber {
    // count the number of digits
    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;

    }

    // Method to check if a number is Disarium
    public static boolean isDisarium(int num) {
        int count = count(num);
        int dig = 0;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int pro = 1;
            dig = num % 10;
            for (int i = 0; i < count; i++) {
                pro = pro * dig;
            }

            count--;
            sum = sum + pro;
            num = num / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();

        if (isDisarium(num)) {
            System.out.println(num + " is a Disarium Number");
        } else {
            System.out.println(num + " is NOT a Disarium Number");
        }
    }

}

/*
Enter a number: 175
175 is a Disarium Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>
C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java DisariumNumber
Enter a number: 135
135 is a Disarium Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java DisariumNumber
Enter a number: 346
346 is NOT a Disarium Number

C:\Users\saqla\OneDrive\Desktop\all_code\ClubCoder\java\number and series>java DisariumNumber
Enter a number: 624
624 is NOT a Disarium Number
*/