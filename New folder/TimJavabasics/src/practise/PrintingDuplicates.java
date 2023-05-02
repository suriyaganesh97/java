package practise;

public class PrintingDuplicates {
    public static void main(String[] args) {
        int[] arr1={1, 2, 4, 4, 5, 5, 6, 8, 8};
        int j=0,n=0;
        n=arr1.length;
        int[] arr2=new int[n];
       for(int i=0;i<arr1.length-1;i++){
        if(arr1[i]!=arr1[i+1]){
            arr2[j++]=arr1[i];
        }
       }
       arr2[j++]=arr1[n-1];
       for(int k=0;k<j;k++){
        System.out.println(arr2[k]);
       }
    }
}
