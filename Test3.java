// https://github.com/igoryarmolyuk/Test1Java/tree/master
public class Test3 {
    public static void main(String[] args) {
        test(721, 108);
        int maxDivisibleBy3 = findMaxDivisibleBy3(1000);
        System.out.println("The largest natural number divisible by 3 is: " + maxDivisibleBy3);
    }

    public static void test(int a, int b) {
        System.out.println("first res:");
        System.out.println(a);
        int divide = a;
        while (divide != 0 && divide != 1) {
            System.out.println(divide);
            if (divide == 9) {
                divide /= 3;
                System.out.println(divide);
            }
            divide /= 2;
        }
        if (divide == 1) {
            System.out.println("first value ("+a+") is a true");
        }

        System.out.println("second res:");
        System.out.println(b);
        int divideB = b;
        while (divideB != 0 && divideB != 1) {
            System.out.println(divideB);
            if (divideB == 9) {
                divideB /= 3;
                System.out.println(divideB);
            }
            divideB /= 2;
        }
        if (divideB == 1) {
            System.out.println("first value ("+b+") is a true");
        }
    }

    public static int findMaxDivisibleBy3(int startFrom) {
        for (int i = startFrom; i > 0; i--) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return -1; // Якщо немає числа, яке можна поділити на 3
    }
}
