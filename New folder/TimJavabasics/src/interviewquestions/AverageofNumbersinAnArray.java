package interviewquestions;

public class AverageofNumbersinAnArray {
    public static void main(String args[])
	{
        int[] arr1={1,4,5,8,2,5,6};
        float sum=0, averagevalue=1;
        for(int i:arr1){
            sum+=i;
        }
        averagevalue=sum/arr1.length;
        System.out.println(averagevalue); 
    }
}
