package interviewquestions;

public class SortingAnArray {
    public static void main(String args[]){
        // in below code slection sort algorithm is used
        int[] arr1={2,6,89,5,23};
        int temp=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){// note that loop is for i+1
                // swapping the variable if it is greater than second variable
if(arr1[i]>arr1[j]){ //to sort in descending order change the greater than to lesser than
    temp=arr1[i];   
    arr1[i]=arr1[j];
    arr1[j]=temp;
}
            }
        }

        for(int k:arr1){
            System.out.println(k);
        }
    }
}
