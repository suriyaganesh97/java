package patternPrograms;

public class HalfPyramidNumber {
    public static void main(String[] args) {
        int noOfRows=4;
        for(int i=1;i<=noOfRows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
