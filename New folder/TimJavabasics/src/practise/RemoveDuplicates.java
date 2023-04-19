package practise;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr1={1, 2, 4, 4, 5, 5, 6, 8, 8};
        int j=0,n=0;
        n=arr1.length;
        int[] arr2=new int[n];
        for(int i=0;i<n-1;i++){
            if(arr1[i]!=arr1[i+1]){
                arr2[j++]=arr1[i];
            }
        }
        arr2[j++]=arr1[n-1];
        for(int i=0;i<j;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
