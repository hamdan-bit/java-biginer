import java.math.BigInteger;
public class recursiveFunctions{
    static int sum(int k){
        if(k>5){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }

    static BigInteger factorial(int y){
        if(y>0){
            return BigInteger.valueOf(y).multiply(factorial(y-1));
        }else{
            return BigInteger.ONE;
        }
    }
    public static void main(String[] args){
        int result = sum(7);
        System.out.println("Sum is " + result);

        BigInteger numFactorial = factorial(result);
        System.out.println(result + " factorial is " + numFactorial);


    }
}