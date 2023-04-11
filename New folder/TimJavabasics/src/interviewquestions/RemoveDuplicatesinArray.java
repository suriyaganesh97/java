package interviewquestions;

public class RemoveDuplicatesinArray {
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

//for removing duplicates
        int[] arr2=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr1[i]!=arr1[i+1]){
                arr2[j++]=arr1[i];
            }
            
        }
         arr2[j++]=arr1[n-1];
// assigning last element of arr1 to arr2 since it would not be included in the loop
// the above line is very important    
// array length without duplicates would be till j only


//pring the new temp array without duplicates just for understading purpose
System.out.print("\nArray with duplicates replaced by zero\n");
for(int k:arr2){
    System.out.print(k+" ");
}

//changing original array
for(int i=0;i<j;i++){
    arr1[i]=arr2[i];
}

//printing the array without duplicates
System.out.print("\nArray without duplicates\n");
for(int i=0;i<j;i++){
    System.out.print(arr1[i]+" ");
}
    } 
}
