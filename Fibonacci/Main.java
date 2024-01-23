package Fibonacci;
import java.util.ArrayList; // import the ArrayList class


public class Main {
    public static int fibonacciNum(int n) {
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else return (fibonacciNum(n - 1) + fibonacciNum(n - 2));
        }

    public static int fibonacciSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += fibonacciNum(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fibonacciSum(0));
        System.out.println(fibonacciSum(1));
        System.out.println(fibonacciSum(2));
        System.out.println(fibonacciSum(3));
        System.out.println(fibonacciSum(4));
        System.out.println(fibonacciSum(10));
        System.out.println(fibonacciSum(-1));
    }
}
