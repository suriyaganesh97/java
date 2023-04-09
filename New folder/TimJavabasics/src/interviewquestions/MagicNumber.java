package interviewquestions;

// Write a Java Program to check if any number is a magic number or not. A
// number is said to be a magic number if a􀈅er doing sum of digits in each step
// and inturn doing sum of digits of that sum, the ultimate result (when there is
// only one digit le􀈅) is 1.
public class MagicNumber {
    public static void main(String args[])
	{
        int num=1235,rev=0,sum=0;
        while(num>9){// outer while loop which checks for number has gone down to single digit or not
            while(num!=0){// same sum of digits concept
                rev=num%10;
                sum+=rev;
                num=num/10;
            }
            num=sum;// we are assigning to num so if it is more than a digit to find sum of digits again
            sum=0;//sum should be assigned to zero before next loop

        }
       if(num==1){
        System.out.println("it is a magic number");
       } else{
        System.out.println("it is not a magic number");
       }
       

    }
}
