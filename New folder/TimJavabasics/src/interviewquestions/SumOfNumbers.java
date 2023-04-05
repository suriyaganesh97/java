package interviewquestions;
import java.util.*;
public class SumOfNumbers {
    public static void main(String args[]){
        int sum=0, n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number limit to print the sum of numbers\n");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
