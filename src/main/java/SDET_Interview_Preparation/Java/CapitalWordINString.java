package SDET_Interview_Preparation.Java;

import java.util.Scanner;

//Question : Write a Java Program to get the count of Capitalized words in a String.
public class CapitalWordINString {

    public static void main(String[] args) {
        //Taking Input from the User
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please Enter the String :");
        String inputstr = sc.nextLine();
        int counter = 0;

        for(int i=0; i<inputstr.length(); i++){
            if(inputstr.charAt(i)  >= 'A' && inputstr.charAt(i)<='Z') {
                counter++;
            }
        }
            System.out.println("The Total Capital words are : "+counter);
    }
}
