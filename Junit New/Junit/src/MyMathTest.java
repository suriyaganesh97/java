
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class MyMathTest {
    @Test
    public void test(){
    int[] numbers={1,2,3};
    MyMath math=new MyMath();
    int result=MyMath.addNumbers(numbers);
    int expectedResult=6;
    assertEquals(result, expectedResult);
    }
}
