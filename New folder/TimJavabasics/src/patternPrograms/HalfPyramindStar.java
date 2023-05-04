package patternPrograms;

public class HalfPyramindStar {
  public static void main(String[] args) {
    int noOfRows=4;
    for(int i=1;i<=noOfRows;i++){
        for(int j=1;j<=i;j++){ // use 1 for looping and control variable for inner loop is i
            System.out.print("*"); // use print and not println
        }
        System.out.print("\n");
    }
  }  
}
