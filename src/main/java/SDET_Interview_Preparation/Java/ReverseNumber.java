package SDET_Interview_Preparation.Java;


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        //Scanner Class to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        // loop to reverse number
        while (num != 0) {
            int digit = num % 10;           // extract last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;                 // remove last digit
        }

        //Printing reverse number
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
