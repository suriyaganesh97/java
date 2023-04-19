package practise;

public class ReverseNumber {
    public static void main(String args[]){
        int num=783,rev=0,rem=0;
        while(num!=0){
            rev = num%10;
            rem=rem*10+rev;
            num=num/10;
        }
        System.out.println("reverse "+rem);
        

    }
}
