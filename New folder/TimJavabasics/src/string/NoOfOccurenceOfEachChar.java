package string;

public class NoOfOccurenceOfEachChar {
    public static void main(String[] args) {
        String s1="suriya ganesh";
        int counter[]=new int[256]; //initialising an integer array for storing the count of the 256 ascii characters
        
        for(int i=0;i<s1.length();i++){
 // if s is the character then we are typecasting it to its integer value(ascii value) 
            counter[(int)s1.charAt(i)]++;
// ascii value of s in java is 115 so we update the count of 115th element to 1 in above line
        }
        for(int i=0;i<256;i++){
            if(counter[i]!=0){// printing only the values which has occured
                System.out.println((char) i + " --> " + counter[i]);
//typecasting back to character from its ascii value
            }
             
        }
    }
}
