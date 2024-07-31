package homework;

// https://github.com/igoryarmolyuk/Test1Java/tree/master
public class Five {
    public static void main(String[] args) {
        int[] bubble = {4, 7, 5, 6};
        int[] insert = {3, 7, 6, 5};
        print(bubble);
        // Сортування бульбашкою
        bubbleSort(bubble);
        // Сортування вставками
        print(insert);
        insertSort(insert);
    }

    public static void bubbleSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
        }
    }

    public static void insertSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int key = ar[i];
            int j;
            for (j = i - 1; j >= 0 && ar[j] > key; j--) {
                ar[j + 1] = ar[j];
            }
            ar[j + 1] = key;
        }
    }


    public static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i != ar.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
