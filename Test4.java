public class Test4 {
    public static void main(String[] args) {
        int[][] t1 = {{1,2,3}, {3,4,5}, {9, 10, 16, 5, 100, 521}};
        int task1 = Task1(t1);
        System.out.println(task1);
        int[][] t2 = {{123, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int task2 = Task2(t2);
        System.out.println(task2);
    }
    public static int Task1(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("result for task1:");
        return sum;
    }
    public static int Task2(int[][] a) {
        int test = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                test += a[i][j];
                count++;
            }
        }
        System.out.println("result for task2:");
        return test / count;
    }
    public static int Task3(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                
            }
        }
        System.out.println("result for task3:");
        return sum;
    }
}
