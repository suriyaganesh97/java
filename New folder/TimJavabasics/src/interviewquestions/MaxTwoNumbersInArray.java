package interviewquestions;

public class MaxTwoNumbersInArray {
    public static void main(String args[]){
        int num[] = {6,9,80,56,90,1};
        int maxone=0,maxtwo=0;
        for(int i:num){// if u sort and display the max two it will take two loops but this takes only one loop so this is better
            
            if(i>maxone){
                maxtwo=maxone;
                maxone=i;
            } else if(i>maxtwo){
                maxtwo=i;
            }
        }
        System.out.println("First Maximum value "+maxone);
        System.out.println("Second Maximum value "+maxtwo);

    }
}
