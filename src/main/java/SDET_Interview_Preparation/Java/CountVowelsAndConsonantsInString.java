package SDET_Interview_Preparation.Java;

import java.util.Scanner;

public class CountVowelsAndConsonantsInString {

    public static void main(String[] args) {
        //Taking Input String from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String S = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        // convert to lowercase to make comparison easy
        S = S.toLowerCase();

        for (int i = 0; i < S.length(); i++) {

            char ch = S.charAt(i);
            // check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // check if vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Input String: " + S);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        sc.close();
    }

}








