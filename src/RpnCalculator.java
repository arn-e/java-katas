public class RpnCalculator {

    public int calculate(String input) {
        String[] splitInput = input.split(" ");
        int[] values = new int[splitInput.length];
        int idx = 0;
        for ( String rpnValue : splitInput ) {
            if ( rpnValue.equals("+") || rpnValue.equals("-") || rpnValue.equals("*")) {
                int res = updateTotal(values, rpnValue, idx);
                values = new int[splitInput.length];
                values[0] = res;
            } else {
                values[idx] = Integer.parseInt(rpnValue);
                idx ++;
            }
        }
        return values[0];
    }

    private int updateTotal(int[] input, String method, int idx) {
        int result;
        if ( method.equals("+") ) {
            result = sum(input);
        } else if ( method.equals("-") ) {
            result = subtract(input);
        } else if ( method.equals("*") ) {
            result = product(input, idx);
        } else {
            result = 0;
        }
        return result;
    }

    private int product(int[] input, int idx) {
        int product = input[0];
        for (int i = 1; i < idx; i ++ ){
            product = product * input[i];
        }
        return product;
    }

    private int sum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i ++ ){
            sum = sum + input[i];
        }
        return sum;
    }

    private int subtract(int[] input) {
        int total = input[0];
        for (int i = 1; i < input.length; i ++ ){
            total = total - input[i];
        }
        return total;
    }
}
