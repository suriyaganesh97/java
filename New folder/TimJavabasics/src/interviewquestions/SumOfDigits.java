package interviewquestions;
import java.util.*;
public class SumOfDigits {
    public static void main(String args[]){
        int num=0,rev=0,rem=0,sum=0;
        Scanner sc=new Scanner(System.in);//572
        System.out.println("enter a large number to get the sum of its digits\n");
        num=sc.nextInt();
        sc.close();
    while(num!=0){
        rev=num%10;
        sum+=rev;
        num=num/10;
    }
    System.out.println(sum);
    }
}
