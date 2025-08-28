package SDET_Interview_Preparation.Java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //Taking Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number to check : ");
        int num = sc.nextByte();
        System.out.println("The given number is PRIME : "+isPrime(num));

    }
    public static boolean isPrime (int number){
        // Numbers less than or equal to 1 are not prime
        if(number<=1) {
            return false;
        }

        // If divisible, it's not prime
        for(int i=2; i*i <= number; i++){
            if(number%i==0){
                return false;
            }
        }

        // If no divisors found, it's prime
        return true;
    }
}
