// https://github.com/igoryarmolyuk/Test1Java/tree/master
public class Test1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 8, 4};
        int[] arr2 = {5, 4, 3, 2, 1};

        checkSorted(arr1);
        checkSorted(arr2);
    }

    public static void checkSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        // Перевірка чи масив відсортований у зростаючому порядку
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        // Перевірка чи масив відсортований у спадаючому порядку
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
                break;
            }
        }

        if (ascending) {
            System.out.println("Масив є відсортованим у зростаючому порядку.");
        } else if (descending) {
            System.out.println("Масив є відсортованим у спадаючому порядку.");
        } else {
            System.out.println("Масив не є відсортованим у зростаючому або спадаючому порядку.");
        }
    }
}