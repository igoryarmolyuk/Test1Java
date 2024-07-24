package org.lessons;

class Four {
    public static void task1() {
        System.out.println("Task1:");
        int[] test = new int[55];
        for (int i = 1; i < test.length; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task2:");
        int[] test = new int[1];
        for (int i = 100; i > test.length; i-=5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task3:");
        for (int i = 1; i < 1048577; i*=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4(int start, int end) {
        System.out.println("Task4:");
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task5(int start, int end) {
        System.out.println("Task5:");

        int[] multiples = {start, end};

        if (multiples[0] < multiples[1]) {
            int temp = multiples[0];
            multiples[0] = multiples[1];
            multiples[1] = temp;
        }

        int sum = 0;

        for (int i = multiples[0]; i >= multiples[1]; i--) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static int task1hard(int[] array) {
        System.out.println("Task1Hard:");
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] task2hard(int[] array) {
        System.out.println("Task2Hard:");
        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        return new int[]{sum, count};
    }

    public static void task3hard(int n) {
        System.out.println("Task3Hard:");
        int first = 1;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4(-29, 10);
        task5(150, 50);
        int[] array = {5, -3, -2, 16, 55, 0};
        System.out.println("Найбільше значення в масиві: " + task1hard(array));
        int[] array1 = {5, -3, -2, 16, 55, 0};
        int[] result = task2hard(array1);
        System.out.println("Сума позитивних чисел: " + result[0]);
        System.out.println("Кількість позитивних чисел: " + result[1]);
        task3hard(11);

    }
}