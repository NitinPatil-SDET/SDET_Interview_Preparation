package SDET_Interview_Preparation.Java;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        /* Taking Input from the user */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String to reverse : ");
        String ActualString = sc.nextLine();

        /* Using stringBuilder for the stored reverse the String */
        StringBuilder ResString = new StringBuilder();

        /* Using for loop to reverse the string */
        for(int i=ActualString.length() - 1; i>=0;  i--){
            ResString = ResString.append(ActualString.charAt(i));
        }

        /* Printing Actual string and reverse string */
        System.out.println("This is Actual String  : "+ActualString);
        System.out.println("This is Reverse String : "+ResString);

    }
}


