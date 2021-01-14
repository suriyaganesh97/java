package loops;

public class SumDigit {

	public static void main(String[] args) {
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(26));
		System.out.println(sumDigits(9));
	}
    public static int sumDigits(int numValue)
    {
    	int num=0,sum=0;
    	if(numValue>=10)
    	{
      while(numValue>0)
      {
    	  num=numValue%10;  // taking the last digit
    	  sum+=num;
    	  numValue=numValue/10;  //taking the remaining portion
    	  
      }
    		
    		return sum;
    	}
    return -1;
    		
    }
}
