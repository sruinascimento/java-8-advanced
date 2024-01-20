package br.com.rsfot.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        SumOperator sum = (int a, int b) -> a + b;
        System.out.println(sum.calculate(10, 12));
    }
}
