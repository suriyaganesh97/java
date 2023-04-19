package practise;

public class ArmstrongNumber {
    public static void main(String args[])
	{
        int num=371,rev=0,sum=0,temp=0;
        temp=num;
        while(num!=0){
            rev=num%10;
            sum+=(rev*rev*rev);
            num=num/10;
        }
        System.out.println(sum);
    }   
}
