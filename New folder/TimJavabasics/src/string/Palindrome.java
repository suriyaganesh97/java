package string;

public class Palindrome {
    public static void main(String[] args) {
        String s1="madam",s2="";
        for(int i= s1.length()-1;i>=0;i--){//reversing string and stroign in s2
            s2+=s1.charAt(i);
        }
        if(s1.equals(s2)){ // normal equal to will not work remember this
            System.out.println("It is a palindrome");
        } else{
            System.out.println("It is not a palindrome");
        }

    } 
}
