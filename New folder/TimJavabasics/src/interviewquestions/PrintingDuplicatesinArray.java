package interviewquestions;

public class PrintingDuplicatesinArray {
    public static void main(String[] args) {
        int[] arr1={1,4,5,8,2,5,4,6,8};
        int n=arr1.length, temp=0;
        // to remove duplicates u should sort the array first
        //if it is sorted one you can go for removing duplicates straight away
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr1[i]>arr1[j]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }

        //printing sorted array
        for(int k:arr1){
            System.out.print(k+" ");
        }

        int[] arr2=new int[n];
        int j=0;
        //storing duplicates
        for(int i=0;i<n-1;i++){
            if(arr1[i]==arr1[i+1]){
                arr2[j++]=arr1[i];
            }
        }
    
        System.out.print("\nArray with duplicates and other value replaced by zero\n");
    //printing arr2 this is just for understanding purpose
    for(int k:arr2){
        System.out.print(k+" ");
    }


    System.out.print("\nPrinting array with duplicate values\n");
    //printing arr2 only with eligible values
    for(int i=0;i<j;i++){
        System.out.print(arr2[i]+" ");
    }
    
    }
}
