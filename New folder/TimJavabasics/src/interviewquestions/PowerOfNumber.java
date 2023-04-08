package interviewquestions;

public class PowerOfNumber {
    public static void main(String args[])
	{
        int num=5,power=3, result=1;
        for(int i=0;i<power;i++){
        result*=num;
        }
        System.out.println(result); 

    }
}
