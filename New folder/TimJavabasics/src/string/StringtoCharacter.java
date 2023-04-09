package string;

public class StringtoCharacter {
    public static void main(String[] args) {
        String s1="suriyaganesh";
        char a='a';

        //to print as characters
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }

        // to use it in indivdual characeters
        for(int i=0;i<s1.length();i++){
            a=s1.charAt(i);
            System.out.println(a);
        }
    }
}
