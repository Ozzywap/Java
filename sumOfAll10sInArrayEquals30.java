//https://www.w3resource.com/java-exercises/array/index.php

//Write a Java program to check if the sum of all the 10's in the array is exactly 30.

//Return false if the condition does not satisfy, otherwise true.

// @Osman Haji
public class sumOfAll10sInArrayEquals30 {

    public static void main(String[] args) {
        int[] arr = {12,10,3,45,11,10,19,44,63,10,15,13};

        System.out.println(sumTo30(arr));

    }

    public static boolean sumTo30(int[] arr){
        boolean retVal = false;
        int sum = 0;
        for (int i : arr) {
            if (i == 10) {
                sum += i;
            }
        }

        if(sum == 30){
            retVal = true;
        }

        return retVal;
    }
}
