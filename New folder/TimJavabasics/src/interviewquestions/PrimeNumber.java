package interviewquestions;

public class PrimeNumber {
    public static void main(String args[])
	{
        int num=30;
        boolean isPrimeflag=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrimeflag=false;
                break; // break is used to break the for loop if it is not a prime no to reduce iterations
            }
        }
        if(isPrimeflag){
            System.out.println("The number is a prime number"); 
        } else{
            System.out.println("The number is not a prime number"); 
        }
    }
}
