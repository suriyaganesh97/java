package arrays;

public class sumOfElements {
    public static void main(String args[]){
        int[] arr1={1,2,5,3,4};
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
}
