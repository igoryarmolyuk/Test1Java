package library;

import java.util.Arrays;

interface Task {
    void execute();
}

class Task1 implements Task {
    @Override
    public void execute() {
        System.out.println("Task1:");
        for (int i = 1; i < 55; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Task2 implements Task {
    @Override
    public void execute() {
        System.out.println("Task2:");
        for (int i = 100; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Task3 implements Task {
    @Override
    public void execute() {
        System.out.println("Task3:");
        for (int i = 1; i < 1048577; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Task4 implements Task {
    private final int start;
    private final int end;

    public Task4(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        System.out.println("Task4:");
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Task5 implements Task {
    private final int start;
    private final int end;

    public Task5(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        System.out.println("Task5:");
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        int sum = 0;
        for (int i = max; i >= min; i--) {
            sum += i;
        }
        System.out.println(sum);
    }
}

class Task1Hard {
    public int findMax(int[] array) {
        System.out.println("Task1Hard:");
        return Arrays.stream(array).max().orElseThrow();
    }
}

class Task2Hard {
    public int[] sumAndCountPositives(int[] array) {
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
}

class Task3Hard {
    public void printFibonacci(int n) {
        System.out.println("Task3Hard:");
        if (n < 1) return;
        int first = 1, second = 1;
        System.out.print(first + " ");
        if (n > 1) {
            System.out.print(second + " ");
        }
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
}

public class Four {
    public static void main(String[] args) {
        Task task1 = new Task1();
        task1.execute();

        Task task2 = new Task2();
        task2.execute();

        Task task3 = new Task3();
        task3.execute();

        Task task4 = new Task4(-29, 10);
        task4.execute();

        Task task5 = new Task5(150, 50);
        task5.execute();

        int[] array = {5, -3, -2, 16, 55, 0};
        Task1Hard task1Hard = new Task1Hard();
        System.out.println("Найбільше значення в масиві: " + task1Hard.findMax(array));

        int[] array1 = {5, -3, -2, 16, 55, 0};
        Task2Hard task2Hard = new Task2Hard();
        int[] result = task2Hard.sumAndCountPositives(array1);
        System.out.println("Сума позитивних чисел: " + result[0]);
        System.out.println("Кількість позитивних чисел: " + result[1]);

        Task3Hard task3Hard = new Task3Hard();
        task3Hard.printFibonacci(11);
    }
}
