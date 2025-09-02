package SDET_Interview_Preparation.Java;

//Question :  Write a Java Program to print the second-largest number in a given array.
public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int [] arr = {23,43,21,76,11,9};

        // By Using Bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[i]>=arr[j+1]){
                    //swap element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        // After sorting → arr[0] is largest
        int largest = arr[0];
        int secondLargest = -1;

        // Find the first element smaller than largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == -1) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest is: " + secondLargest);
        }

    }
}
