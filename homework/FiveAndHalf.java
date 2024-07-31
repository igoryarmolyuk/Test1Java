package homework;

public class FiveAndHalf {
    public static void main(String[] args) {
        triangle();
    }
    public static void triangle() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5 && i<4 || i+5 == j && i<4 || i == 3 && j == 6 || i==3 && j == 7) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}