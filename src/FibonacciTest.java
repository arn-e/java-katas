import org.junit.Test;
import org.testng.Assert;

public class FibonacciTest {
    @Test
    public void testCalcFibonacci() throws Exception {
        int target = 10;
        int expectedResult = 55;

        int result = Fibonacci.calcFibonacci(target, 1, 0, 1);
        Assert.assertEquals(result, expectedResult);
    }
}
