class Test {
    public static void task1(int a, int b) {
        System.out.println("The GCD of " + a + " and " + b + " is " + findGCD(a, b));
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void task2(int num, int userNum) {
        System.out.println("The sum of digits of " + num + " is equal to " + userNum + ": " + (sumDigits(num) == userNum));
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void task3(int userNum) {
        System.out.println("The first prime Fibonacci number starting from position " + userNum + " is " + findPrimeFibonacci(userNum));
    }

    private static int findPrimeFibonacci(int userNum) {
        int a = 0, b = 1, position = 2;
        while (true) {
            int next = a + b;
            a = b;
            b = next;
            position++;
            if (position >= userNum && isPrime(next)) {
                return next;
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void task4(int[] array) {
        if (isSortedAscending(array)) {
            System.out.println("The array is sorted in ascending order.");
        } else if (isSortedDescending(array)) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    private static boolean isSortedAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        task1(48, 18);
        task2(123, 6);
        task3(5);
        int[] array = {1, 2, 3, 4, 5};
        task4(array);
    }
}