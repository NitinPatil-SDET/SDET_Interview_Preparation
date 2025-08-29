package SDET_Interview_Preparation.Java;

//Question : Write a Java Program to swap two given Number

public class SwappingTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping A -"+a+" and B -"+b);

        //Method 1 : Swap Using temp variable
        /*
        int temp=a;
         a=b;
         b=temp;
        System.out.println("After Swapping A -"+a+" and B -"+b);
        */

        //Method 2 : Without using any variable

        a=a+b; //30
        b=a-b; //10
        a=a-b;

        System.out.println("After Swapping A -"+a+" and B -"+b);

    }
}
