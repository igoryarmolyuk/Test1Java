public class Test {
    public static void main(String[] args) {
        task1(10); // Приклад виклику функції з номером 10
    }

    public static void task1(int userNum) {
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;

        for (int i = 2; i <= userNum; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        while (!isPrime(fib)) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        System.out.println("Перше просте число в послідовності Фібоначчі, починаючи з " + userNum + "-го номера: " + fib);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
