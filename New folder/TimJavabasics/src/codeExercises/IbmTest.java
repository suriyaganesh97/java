package codeExercises;
import java.util.*;

public class IbmTest {
    public static void main(String[] args) {
        // List<Integer> num1 = new ArrayList<>();
        // num1.add(5);
        // num1.add(6);
        // // System.out.println(num1);
        // // for(int i:num1){
        // //     System.out.println(i);  
        // // }
        // //list to array
        // int[] arr1=new int[num1.size()];
        // for(int i=0;i<arr1.length;i++){
        //     arr1[i]=num1.get(i);
        // }
        // for(int i:arr1){
        //     System.out.println(i);  
        // }
        int x=0;
        int y=0;
        for(int z=0;z<5;z++){
            if((++x>2)||(++y>2)){
                x++;
            }
        }
        System.out.println(y); 
        

    }
}
