public class Fibonacci {

    public static int calcFibonacci(int target, int index, int a, int b) {
        int returnVal = b;

        if ( index == 0 ){
            return a;
        } else if ( target == 1 || index == target ) {
            return b;
        } else {
            returnVal = calcFibonacci(target, (index + 1), b, ( a + b ));
        }
        return returnVal;
    }

    public static void main(String[] args){
        int result = calcFibonacci(10, 1, 0, 1);
        System.out.print(result);
    }
}
