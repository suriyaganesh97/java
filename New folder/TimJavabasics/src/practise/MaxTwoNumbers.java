package practise;

public class MaxTwoNumbers {
    public static void main(String args[])
	{
        int num[] = {6,9,80,56,90,1};
        int maxone=0, maxtwo=0;
        for(int i=0;i<num.length;i++){
          if(num[i]>maxone){
            maxtwo=maxone;
            maxone=num[i];
          } else if(num[i]>maxtwo){
            maxtwo=num[i];
          }
        }
        System.out.println(maxone);
        System.out.println(maxtwo);
    }
}
