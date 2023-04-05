package interviewquestions;
import java.util.*;

public class NumberPalindrome {
    public static void main(String args[]){
        int num=0,rev=0,rem=0,temp=0;
        Scanner sc=new Scanner(System.in);//572
        System.out.println("enter a large number to get its reverse\n");
        num=sc.nextInt();
        sc.close();
        temp=num;// store in temp as num will be directly modified
        while(num!=0){
            rev=num%10;
            rem=rem*10+rev;
            num=num/10;
        }
        
        if(temp==rem){ // compare with rem as it is the reveresed number not rev
            System.out.println("Palindrome");
        } else{
            System.out.println(" Not a Palindrome");
        }
    }

}
