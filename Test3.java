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
        int devide = a;
        for (; devide != 0 && devide != 1; ) {
            System.out.println(devide);
            if (devide == 9) {
                devide /= 3;
                System.out.println(devide);
            }
            devide /= 2;
        }
        if (devide == 1) {
            System.out.println("first value ("+a+") is a true");
        }

        System.out.println("second res:");
        System.out.println(b);
        int devideB = b;
        for (; devideB != 0 && devideB != 1;) {
            System.out.println(devideB);
            if (devideB == 9) {
                devideB /= 3;
                System.out.println(devideB);
            }
            devideB /= 2;
        }
        if (devideB == 1) {
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
