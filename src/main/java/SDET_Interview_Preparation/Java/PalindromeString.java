package SDET_Interview_Preparation.Java;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        // Taking Input from the User
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String to check palindrome or not ");
        String ActualString = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i=ActualString.length()-1; i>=0; i--){
           sb = sb.append(ActualString.charAt(i));
        }
       String  ReverseString = sb.toString();

        if(ActualString.equalsIgnoreCase(ReverseString)){
            System.out.println("The Given String is Palindrome");
        }
        else {
            System.out.println("The Given String is Diaphodrome");
        }


    }
}
