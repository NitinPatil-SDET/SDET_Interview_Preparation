package SDET_Interview_Preparation.Java;

import java.util.Scanner;
//Question : Write a Java Program to print the sum of digits of a given integer.

public class SumOfDigits {
    public static void main(String[] args) {

        //Taking Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Positive Integer value");
        int num = sc.nextInt();

        // Declare variable sum which will store the sum of all digits.
        int sum = 0;

        // Calculating Sum Of Digits
        while(num>0){
            sum = sum+num%10;
            num = num/10;
        }

        //Printing Sum Of Digit
        System.out.println("Sum Of Digit is :"+sum);

    }
}
