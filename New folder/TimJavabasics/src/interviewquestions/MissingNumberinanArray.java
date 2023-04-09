package interviewquestions;

public class MissingNumberinanArray {
    public static void main(String args[])
	{
        int[] arr = { 1, 2, 3, 5 ,4,7,8};
        // this is assuming no duplicates in array
        int lengthOfArray=arr.length,sumOfNumbers=0,missingNumber=0,sumOFelemenetsinArr=0;
        //logic is we find the sum of numbers through formula and subtract the numbers in the array
        // to find sum of natural numbers formula
        //n(n+1)/2 but here since one number is missing we have to use n+1 instead of n
        sumOfNumbers=((lengthOfArray+1)*(lengthOfArray+2))/2;
        for(int i:arr){
            sumOFelemenetsinArr+=i;
        }
        missingNumber=sumOfNumbers-sumOFelemenetsinArr;
        System.out.println("the missing number is "+missingNumber);

    } 
}
