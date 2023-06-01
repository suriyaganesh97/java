package oops;

import java.util.Arrays;

public class abstraction {
    public static void main(String[] args) {
        int[] arr={12,5,2,3,56,7,8};
        System.out.println("before sorting");
        for(int i:arr){
            System.out.println(i);
        } 
        Arrays.sort(arr);
        System.out.println("after sorting");

        for(int i:arr){
            System.out.println(i);
        } 
    }


}
