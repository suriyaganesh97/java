package string;

public class ReverseaString {
    public static void main(String[] args) {
        String s1="suriya",newString="";
        for(int i=s1.length()-1;i>=0;i--){
            newString+=s1.charAt(i);
        }
        System.out.println(newString);
    }
}
