package homework;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("GDC: " + test(22, 12));
        System.out.print(test2(23, 6));
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
    public static int test2(int a, int b) throws Exception {
        int result = 0;
        int count = String.valueOf(a).length();

        for (int i = 1; i < count; i++) {
            System.out.println(i);
            result += (a % 10);
            a /= 10;
            if (a<10)
                result += a;
        }
        System.out.println(a);
        if (b != result) {
            throw new Exception("It's not equal to: " + result);
        } else {
            System.out.print("It's equal to: ");
        }

        return result;
    }
}