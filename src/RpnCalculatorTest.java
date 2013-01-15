import org.junit.Test;
import org.testng.Assert;

public class RpnCalculatorTest {
    @Test
    public void testCalculateAdd() throws Exception {
        String input = "2 2 +";
        int expectedResult = 4;

        RpnCalculator rpn = new RpnCalculator();
        int result = rpn.calculate(input);

        Assert.assertEquals(result, expectedResult);
        Assert.assertEquals(rpn.calculate("2 3 1 +"), 6);
    }

    @Test
    public void testCalculateSubtract() throws Exception {
        String input = "6 3 -";
        int expectedResult = 3;

        RpnCalculator rpn = new RpnCalculator();
        int result = rpn.calculate(input);

        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testCalculateProduct() throws Exception {
        String input = "3 4 *";
        int expectedResult = 12;

        RpnCalculator rpn = new RpnCalculator();
        int result = rpn.calculate(input);

        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testCalculateCombinations() throws Exception {
        String input = "3 4 2 + 2 1 -";
        int expectedResult = 6;

        RpnCalculator rpn = new RpnCalculator();
        int result = rpn.calculate(input);

        Assert.assertEquals(result, expectedResult);

    }

}
