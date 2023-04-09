package string;

public class StringCompare {
    public static void main(String[] args) {
        String s1="suriya",s2="suriya";
        boolean isSameFlag=true;
        if(s1.length()==s2.length()){// chekcing whther length is same or else ignoring
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    isSameFlag=false;
                    System.out.println("The Strings are not equal");
                    break;
                }
            }
            if(isSameFlag){
                System.out.println("The Strings are equal");
            }
                

        } else{
            System.out.println("The Strings are not equal");
        }
       
        
    }
}
