package homework.TwentyFour;

import java.util.HashSet;
import java.util.Set;

public class Seven {
    public static void main(String[] args) {
        int[][] test = {{3, 5, 9, 1}, {7, 2, 8, 6}, {4, 9, 1, 31}};
        System.out.println("Sum of all elements: " + task1(test));

        System.out.println("Average value of all elements: " + task2(test));

        task3(test);
        task4(test);
        task5(test);

        System.out.println("All diagonal elements are positive: " + task6(test));

        task7(test, 0, 1);

        task8(test);

        System.out.println("Count of even numbers: " + task9(test));

        System.out.println("Count of negative numbers: " + task10(test));

        task11(test);

        System.out.println("Sum of left and right diagonals are equal: " + task12(test));

        System.out.println("Sum of left diagonal elements: " + task13(test));

        System.out.println("Count of elements less than 5: " + task14(test, 5));

        System.out.println("All elements are unique: " + task15(test));
    }

    public static int task1(int[][] result) {
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                sum += result[i][j];
            }
        }
        return sum;
    }

    public static int task2(int[][] result) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                sum += result[i][j];
                count++;
            }
        }

        return sum / count;
    }

    public static int[] task3(int[][] result) {
        int[] maxValues = new int[result.length];

        for (int i = 0; i < result.length; i++) {
            int max = result[i][0];
            for (int j = 1; j < result[i].length; j++) {
                if (result[i][j] > max) {
                    max = result[i][j];
                }
            }
            maxValues[i] = max;
        }

        System.out.print("Max values in each row: ");
        for (int i = 0; i < maxValues.length; i++) {
            System.out.print(maxValues[i]);
            if (i < maxValues.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        return maxValues;
    }

    public static int[] task4(int[][] result) {
        int[] minValues = new int[result.length];

        for (int i = 0; i < result.length; i++) {
            int min = result[i][0];
            for (int j = 1; j < result[i].length; j++) {
                if (result[i][j] < min) {
                    min = result[i][j];
                }
            }
            minValues[i] = min;
        }

        System.out.print("Min values in each row: ");
        for (int i = 0; i < minValues.length; i++) {
            System.out.print(minValues[i]);
            if (i < minValues.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        return minValues;
    }

    public static int[] task5(int[][] result) {
        int[] sumValues = new int[result.length];

        for (int i = 0; i < result.length; i++) {
            int sum = 0;
            for (int j = 0; j < result[i].length; j++) {
                sum += result[i][j];
            }
            sumValues[i] = sum;
        }

        System.out.print("Sum in each row is: ");
        for (int i = 0; i < sumValues.length; i++) {
            System.out.print(sumValues[i]);
            if (i < sumValues.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        return sumValues;
    }

    public static boolean task6(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i][i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public static void task7(int[][] result, int row1, int row2) {
        int[] temp = result[row1];
        result[row1] = result[row2];
        result[row2] = temp;

        System.out.println("Rows " + row1 + " and " + row2 + " swapped.");
    }

    public static void task8(int[][] result) {
        int sum;
        boolean hasNegative;
        System.out.print("Sum of rows with at least one negative number: ");
        for (int i = 0; i < result.length; i++) {
            sum = 0;
            hasNegative = false;
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] < 0) {
                    hasNegative = true;
                }
                sum += result[i][j];
            }
            if (hasNegative) {
                System.out.print(sum + " ");
            }
        }
        System.out.println();
    }

    public static int task9(int[][] result) {
        int count = 0;
        for (int[] row : result) {
            for (int value : row) {
                if (value % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int task10(int[][] result) {
        int count = 0;
        for (int[] row : result) {
            for (int value : row) {
                if (value < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void task11(int[][] result) {
        int replacementValue = 1;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = replacementValue++;
                }
            }
        }

        System.out.println("Array after replacing zeros:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static boolean task12(int[][] result) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int n = result.length;
        for (int i = 0; i < n; i++) {
            leftDiagonalSum += result[i][i];
            rightDiagonalSum += result[i][n - i - 1];
        }
        return leftDiagonalSum == rightDiagonalSum;
    }

    public static int task13(int[][] result) {
        int leftDiagonalSum = 0;
        for (int i = 0; i < result.length; i++) {
            leftDiagonalSum += result[i][i];
        }
        return leftDiagonalSum;
    }

    public static int task14(int[][] result, int threshold) {
        int count = 0;
        for (int[] row : result) {
            for (int value : row) {
                if (value < threshold) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean task15(int[][] result) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int[] row : result) {
            for (int value : row) {
                if (!uniqueValues.add(value)) {
                    return false;
                }
            }
        }
        return true;
    }
}
