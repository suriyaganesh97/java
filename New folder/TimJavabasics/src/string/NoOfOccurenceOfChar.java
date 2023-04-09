package string;

public class NoOfOccurenceOfChar {
    public static void main(String[] args) {
        String s1="suriya ganesh";
        char ch='s';
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The no of occurence of "+ch+" is "+count);
    }
}
