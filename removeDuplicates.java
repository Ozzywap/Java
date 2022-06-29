//https://www.w3resource.com/java-exercises/array/index.php

//Write a Java program to remove the duplicate elements of a given array

// @Osman Haji

import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 5, 6, 6, 7, 8};
        int n = arr.length;
        frRemoveDuplicates(arr,n);

    }

    public static void frRemoveDuplicates(int[] arr, int n){
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        System.out.println(Arrays.toString(temp));
    }

}
