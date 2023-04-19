package practise;

public class MissingNumber {
    public static void main(String args[])
	{
        int[] arr1={1,2,4,5};
        int sumofnat=0,sumofarr=0;
        int n=arr1.length;
        sumofnat=((n+1)*(n+2))/2;
        for(int i:arr1){
            sumofarr+=i;
        }
        System.out.println(sumofnat-sumofarr);
    }   
}
