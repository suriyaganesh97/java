package interviewquestions;

public class ReversingAnArray {
    public static void main(String args[])
	{
        int[] arr1={1,4,5,8,2,5,6};
        int n=arr1.length;
        int j=n-1,i=0,temp=0; 
        // j will traverse in reverse
        // i will traverse in forward
        while(i<j){// swapping the posisitons within an array
            temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            i++; // i gets incremnented in every iteration
            j--; // j gets decremented in every iteration
        }
        for(int k:arr1){
            System.out.println(k); 
          
        }

    }
}
