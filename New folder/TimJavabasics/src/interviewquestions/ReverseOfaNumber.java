package interviewquestions;
import java.util.*;

public class ReverseOfaNumber {
    public static void main(String args[]){
        int num=0,rev=0,rem=0;
        Scanner sc=new Scanner(System.in);//572
        System.out.println("enter a large number to get its reverse\n");
        num=sc.nextInt();
        sc.close();// comments are for first iteration
        while(num!=0){
            rev=num%10; //2
            rem=rem*10+rev; //0+2=2
            num=num/10; //57
        }
        System.out.println(rem);
    }
}
