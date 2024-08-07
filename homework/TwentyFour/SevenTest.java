package homework.TwentyFour;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SevenTest {

    int[][] testArray = {{3, 5, 9, 1}, {7, 2, 8, 6}, {4, 9, 1, 31}};

    @Test
    public void testTask1() {
        assertEquals(86, Seven.task1(testArray));
    }

    @Test
    public void testTask2() {
        assertEquals(7, Seven.task2(testArray));
    }

    @Test
    public void testTask3() {
        assertArrayEquals(new int[]{9, 8, 31}, Seven.task3(testArray));
    }

    @Test
    public void testTask4() {
        assertArrayEquals(new int[]{1, 2, 1}, Seven.task4(testArray));
    }

    @Test
    public void testTask5() {
        assertArrayEquals(new int[]{18, 23, 45}, Seven.task5(testArray));
    }

    @Test
    public void testTask6() {
        assertTrue(Seven.task6(testArray));
    }

    @Test
    public void testTask7() {
        int[][] expectedArray = {{7, 2, 8, 6}, {3, 5, 9, 1}, {4, 9, 1, 31}};
        Seven.task7(testArray, 0, 1);
        assertArrayEquals(expectedArray, testArray);
        // Swap back to avoid affecting other tests
        Seven.task7(testArray, 0, 1);
    }

    @Test
    public void testTask8() {
        // As there are no negative numbers in testArray, it should not print any sum.
        // We can manually set a negative number to test it.
        int[][] modifiedArray = {{3, 5, 9, 1}, {7, 2, -8, 6}, {4, 9, 1, 31}};
        // Expected output should be "Sum of rows with at least one negative number: -7"
        Seven.task8(modifiedArray); // This test is visual; ensure no negative number exists in output for original testArray.
    }

    @Test
    public void testTask9() {
        assertEquals(4, Seven.task9(testArray));
    }

    @Test
    public void testTask10() {
        assertEquals(0, Seven.task10(testArray));
    }

    @Test
    public void testTask11() {
        int[][] arrayWithZeros = {{3, 0, 9, 0}, {7, 0, 8, 6}, {4, 0, 1, 31}};
        int[][] expectedArray = {{3, 1, 9, 2}, {7, 3, 8, 6}, {4, 4, 1, 31}};
        Seven.task11(arrayWithZeros);
        assertArrayEquals(expectedArray, arrayWithZeros);
    }

    @Test
    public void testTask12() {
        assertFalse(Seven.task12(testArray));
    }

    @Test
    public void testTask13() {
        assertEquals(6, Seven.task13(testArray));
    }

    @Test
    public void testTask14() {
        assertEquals(5, Seven.task14(testArray, 5));
    }

    @Test
    public void testTask15() {
        assertFalse(Seven.task15(testArray));
    }
}
