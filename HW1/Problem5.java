public class Problem5 {

    public static void oneHundredFibonacciNumbers() {
        long[] fibonacci_numbers = new long[100];
        fibonacci_numbers[0] = 1;
        fibonacci_numbers[1] = 1;
        System.out.println(fibonacci_numbers[0]);
        System.out.println(fibonacci_numbers[1]);
        for (int i=2; i <100; i++) {
            fibonacci_numbers[i] = fibonacci_numbers[i - 2] + fibonacci_numbers[i - 1];
            System.out.println(fibonacci_numbers[i]);
        }
    }
    public static void main(String[] args) {
        oneHundredFibonacciNumbers();
    }
}