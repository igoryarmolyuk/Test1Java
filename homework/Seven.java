package homework;

public class Seven {
    public static void main(String[] args) {
        int[][] test = {{1}, {2}, {3}};
        task1(test);

        int[][] test1 = {{3}, {10}, {3}};
        task1(test1);
    }

    public static void task1(int[][] result) {
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                sum += result[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
    public static void task2(int[][] result) {
        double sum = 0;
        double count = 0;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                sum += result[i][j];
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Average value of all elements: " + average);
    }
    public static void task3(int[][] result) {

    }
}
