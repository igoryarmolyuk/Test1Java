package homework;

public class Test {
    public static void main(String[] args) {
        System.out.println(test(22, 12));
        System.out.println(test2(121));
    }
    public static int test(int a, int b) {
        int t = b;
        if (b > a) {
            b = a;
            a = t;
        }
        for (int i = 0; i < a; i++) {
            t--;
            if (a%t == 0 && b%t == 0) {
                break;
            }
        }
        return t;
    }
    public static int test2(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += num % 10;
            num /= 10;
            if (num<10)
                num *=10;
        }

        return sum;
    }
}