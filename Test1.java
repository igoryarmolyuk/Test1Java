public class Test1 {
    public static void main(String[] args) {
        System.out.println("Task1:");
        Task1(1);
        Task1(0);
        Task1(-3);
        System.out.println("\nTask2:");
        Task2(1);
        Task2(0);
        Task2(-3);
        System.out.println("\nTask3:");
        Task3(1);
        Task3(0);
        Task3(-3);
        System.out.println("\nTask4:");
        Task4(1);
        Task4(0);
        Task4(-3);
        System.out.println("\nTask5:");
        Task5(1);
        Task5(0);
        Task5(-3);
        System.out.println("\nTask6:");
        Task6(1);
        Task6(0);
        Task6(-3);
        System.out.println("\nTask7:");
        Task7("test");
        Task7("тест");
        Task7(String.valueOf(3));
        System.out.println("\nTask8:");
        Task8('1');
        Task8(1);
        Task8(3);
        System.out.println("\nTask9:");
        Task9(true);
        Task9(false);
        System.out.println("Task9_5:");
        Task9_5(true);
        Task9_5(false);
        System.out.println("\nTask10:");
        Task10(true);
        Task10(false);
        System.out.println("Task10_5:");
        Task10_5(true);
        Task10_5(false);
        System.out.println("\nTask11:");
        Task11(5);
        Task11(0);
        Task11(-3);
        Task11(2);
        System.out.println("\nTask12:");
        Task12(5);
        Task12(0);
        Task12(-3);
        Task12(2);
        System.out.println("\nTask13:");
        Task13(1, 3);
        Task13(0, 6);
        Task13(3, 5);
        System.out.println("\nTask14:");
        Task14(1, 15);
        Task14(5, 13);
        Task14(3, 15);
        System.out.println("\nTask15:");
        Task15(1);
        Task15(2);
        Task15(3);
        Task15(4);
        System.out.println("\nTask16:");
        Task16(1);
        Task16(11);
        Task16(21);
        System.out.println("\nTask17:");
        Task17(1);
        Task17(3);
        Task17(7);
        Task17(10);
        Task17(12);

    }

    public static void Task1(int a) {
        boolean b = true;
        if (a == 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    public static void Task2(int a) {
        boolean b = true;
        if (a > 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    public static void Task3(int a) {
        boolean b = true;
        if (a < 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    public static void Task4(int a) {
        boolean b = true;
        if (a >= 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    public static void Task5(int a) {
        boolean b = true;
        if (a <= 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    public static void Task6(int a) {
        boolean b = true;
        if (a != 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    public static void Task7(String a) {
        boolean b = true;
        if (a == "test") {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    public static void Task8(int a) {
        if (a == '1') {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }

    public static void Task9(boolean b) {
        if (b) {
            System.out.println(b);
        } else {
            System.out.println(b);
        }
    }

    public static void Task9_5(boolean b) {
        System.out.println(b ? "ok" : "not ok");
    }

    public static void Task10(boolean test) {
        if (!test) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }

    public static void Task10_5(boolean test) {
        System.out.println(!test ? "ok" : "not ok");
    }

    public static void Task11(int a) {
        if (a > 0 && a < 5) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }

    public static void Task12(int a) {
        int resTrue = a + 7;
        int resFalse = a / 10;
        if (a == 0 || a == 2) {
            System.out.println(a + "+7=" + resTrue);
        } else {
            System.out.println(a + "/10=" + resFalse);
        }
    }

    public static void Task13(int a, int b) {
        int resTrue = a + b;
        int resFalse = a - b;
        if (a <= 1 && b >= 3) {
            System.out.println(a + "+" + b + "=" + resTrue);
        } else {
            System.out.println(a + "-" + b + "=" + resFalse);
        }
    }

    public static void Task14(int a, int b) {
        if (a > 2 && a < 11 || b >= 6 && b < 14) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }

    public static void Task15(int num) {
        String result;
        switch (num) {
            case 1:
                result = "Winter";
                break;
            case 2:
                result = "Spring";
                break;
            case 3:
                result = "Summer";
                break;
            case 4:
                result = "Autumn";
                break;
            default:
                result = "Out of the range";
        }

        System.out.println(result);
    }

    public static void Task16(int day) {
        if (day >= 1 && day <= 10) {
            System.out.println("First decade");
        }
        if (day >= 11 && day <= 20) {
            System.out.println("Second decade");
        }
        if (day >= 21 && day <= 31) {
            System.out.println("Third decade");
        }
        if (day <= 0 || day >= 32) { // I used if here because else here is working incorrect
            System.err.println("Out of the range");
        }
    }

    public static void Task17(int month) {
        String[] theSeasons = {"Winter", "Spring", "Summer", "Autumn"};
        if (month >= 1 && month <= 2) {
            System.out.println(theSeasons[0]);
        }
        if (month >= 3 && month <= 6) {
            System.out.println(theSeasons[1]);
        }
        if (month >= 7 && month <= 9) {
            System.out.println(theSeasons[2]);
        }
        if (month >= 10 && month <= 11) {
            System.out.println(theSeasons[3]);
        }
        if (month == 12) {
            System.out.println(theSeasons[0]);
        }
        if (month <= 0 || month >= 13) {
            System.err.println("Out of the range");
        }

    }

}