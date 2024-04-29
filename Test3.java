import static java.lang.Math.round;

public class Test3 {
    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
        problem8();
        problem9();
        problem10();
        problem11();
        problem12();
        problem13();
        problem14();
        problem15();
        problem16();
        problem17();
    }

    public static void problem1() {
        System.out.println("Problem №1");
        wait(1500);
        System.out.println("==========================");
        isEqual(1);
        isEqual(0);
        isEqual(-3);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem2() {
        System.out.println("Problem №2");
        wait(1500);
        System.out.println("==========================");
        isBigger(1);
        isBigger(0);
        isBigger(-3);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem3() {
        System.out.println("Problem №3");
        wait(1500);
        System.out.println("==========================");
        isSmaller(1);
        isSmaller(0);
        isSmaller(-3);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem4() {
        System.out.println("Problem №4");
        wait(1500);
        System.out.println("==========================");
        isBiggerOrEqual(1);
        isBiggerOrEqual(0);
        isBiggerOrEqual(-3);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem5() {
        System.out.println("Problem №5");
        wait(1500);
        System.out.println("==========================");
        isSmallerOrEqual(1);
        isSmallerOrEqual(0);
        isSmallerOrEqual(-3);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem6() {
        System.out.println("Problem №6");
        wait(1500);
        System.out.println("==========================");
        isNotEqual(1);
        isNotEqual(0);
        isNotEqual(-3);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem7() {
        System.out.println("Problem №7");
        wait(1500);
        System.out.println("==========================");
        isTest("test");
        isTest("тест");
        isTest(String.valueOf(3));
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem8() {
        System.out.println("Problem №8");
        wait(1500);
        System.out.println("==========================");
        isOne('1');
        isOne(1);
        isOne(3);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem9() {
        System.out.println("Problem №9");
        wait(1500);
        System.out.println("==========================");
        isTestTrue(true);
        isTestTrue(false);
        System.out.println("==========================");
        System.out.println("Variant 2");
        System.out.println("==========================");
        wait(1500);
        isTestTrueV2(true);
        isTestTrueV2(false);
        System.out.println("==========================");
        wait(1500);

    }

    public static void problem10() {
        System.out.println("Problem №10");
        wait(1500);
        System.out.println("==========================");
        isTestNotTrue(true);
        isTestNotTrue(false);
        System.out.println("==========================");
        System.out.println("Variant 2");
        System.out.println("==========================");
        wait(1500);
        isTestNotTrueV2(true);
        isTestNotTrueV2(false);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem11() {
        System.out.println("Problem №11");
        wait(1500);
        System.out.println("==========================");
        isBiggerAndSmaller(5);
        isBiggerAndSmaller(0);
        isBiggerAndSmaller(-3);
        isBiggerAndSmaller(2);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem12() {
        System.out.println("Problem №12");
        wait(1500);
        System.out.println("==========================");
        isEqualOrNot(5);
        isEqualOrNot(0);
        isEqualOrNot(-3);
        isEqualOrNot(2);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem13() {
        System.out.println("Problem №13");
        wait(1500);
        System.out.println("==========================");
        isEqualOrSmallerAndIsBiggerOrEqual(1, 3);
        isEqualOrSmallerAndIsBiggerOrEqual(0, 6);
        isEqualOrSmallerAndIsBiggerOrEqual(3, 5);
        System.out.println("==========================");
        wait(1500);

    }

    public static void problem14() {
        System.out.println("Problem №14");
        wait(1500);
        System.out.println("==========================");
        isBiggerAndSmallerOrBiggerAndEqual(6, 6);
        isBiggerAndSmallerOrBiggerAndEqual(7, -31);
        isBiggerAndSmallerOrBiggerAndEqual(10, 12);
        isBiggerAndSmallerOrBiggerAndEqual(1, 2);
        System.out.println("==========================");
        wait(1500);

    }

    public static void problem15() {
        System.out.println("Problem №15");
        wait(1500);
        System.out.println("==========================");
        seasons(1);
        seasons(3);
        seasons(4);
        seasons(2);
        seasons(9);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem16() {
        int rng = Math.round(1 + (round(Math.random() * 50)));
        System.out.println("Problem №16");
        wait(1500);
        System.out.println("==========================");
        tenDayPeriod(31);
        tenDayPeriod(12);
        tenDayPeriod(rng);
        tenDayPeriod(5);
        System.out.println("==========================");
        wait(1500);
    }

    public static void problem17() {
        double rng = 1 + (round(Math.random() * 30));
        System.out.println("Problem №17");
        wait(1500);
        System.out.println("==========================");
        season(4);
        season(rng);
        season(8);
        season(10);
        System.out.println("==========================");
        wait(1500);
    }

    // Problem 1
    public static void isEqual(int a) {
        if (a == 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 2
    public static void isBigger(int a) {
        if (a > 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 3
    public static void isSmaller(int a) {
        if (a < 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 4
    public static void isBiggerOrEqual(int a) {
        if (a >= 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 5
    public static void isSmallerOrEqual(int a) {
        if (a <= 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 6
    public static void isNotEqual(int a) {
        if (a != 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 7
    public static void isTest(String a) {
        if (a == "test") {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 8
    public static void isOne(int a) {
        if (a == '1') {
            System.out.println("Correct");

        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 9
    public static void isTestTrue(boolean test) {
        if (test) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 9 extra
    public static void isTestTrueV2(boolean test) {
        System.out.println(test ? "Wrong" : "Correct");
    }

    // Problem 10
    public static void isTestNotTrue(boolean test) {
        if (!test) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 10 extra
    public static void isTestNotTrueV2(boolean test) {
        System.out.println(!test ? "Correct" : "Wrong");
    }

    // Problem 11
    public static void isBiggerAndSmaller(int a) {
        if (a > 0 && a < 5) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 12
    public static void isEqualOrNot(float a) {
        if (a == 0 || a == 2) {
            System.out.println(a + 7);
        } else {
            System.out.println(a / 10);
        }
    }

    // Problem 13
    public static void isEqualOrSmallerAndIsBiggerOrEqual(int a, int b) {
        if (a <= 1 && b >= 3) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }

    // Problem 14
    public static void isBiggerAndSmallerOrBiggerAndEqual(int a, int b) {
        if (a > 2 && a < 11 || b >= 6 && b < 14) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    // Problem 15
    public static void seasons(int num) {
        String result;
        switch (num) {
            case 1:
                result = "Winter";
                System.out.println(result);
                break;
            case 2:
                result = "Spring";
                System.out.println(result);
                break;
            case 3:
                result = "Summer";
                System.out.println(result);
                break;
            case 4:
                result = "Autumn";
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid number! Choose a number from 1 to 4!");
        }
    }

    // Problem `16
    public static void tenDayPeriod(int real_day) {

        if (real_day >= 1 && real_day <= 10) {
            System.out.println("First ten-day period (" + real_day + "th)");
        } else if (real_day > 10 && real_day < 20) {
            System.out.println("Second ten-day period(" + real_day + "th)");
        } else if (real_day >= 20 && real_day <= 31) {
            System.out.println("Third ten-day period(" + real_day + "th)");
        } else {
            System.out.println("Invalid data! The day is " + real_day + ". Instead, pick a number from 1 to 31.");
        }
    }

    // Problem 17
    public static void season(double month) {
        long real_month = Math.round(month);
        if (real_month == 12 || real_month <= 2 && real_month >= 1) {
            System.out.println("This is winter (" + real_month + ")");
        } else if (real_month >= 3 && real_month <= 5) {
            System.out.println("This is spring (" + real_month + ")");
        } else if (real_month >= 6 && real_month <= 8) {
            System.out.println("This is summer (" + real_month + ")");
        } else if (real_month >= 9 && real_month <= 11) {
            System.out.println("This is autumn (" + real_month + ")");
        } else {
            System.out.println("Invalid data! The month is " + real_month + ". Instead, pick a number from 1 to 12.");
        }
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


}
