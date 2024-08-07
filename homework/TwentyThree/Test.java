//package homework.TwentyThree;
//
//import org.junit.jupiter.api.homework.Test;
//
//import java.util.Arrays;
//
//import static org.junit.Assert.assertEquals;
//
//class NumberProcessorTest {
//
//    @homework.Test
//    void testSumOfEvenNumbers() {
//        NumberProcessor processor = new NumberProcessor();
//        processor.addNumbers(1, 2, 3, 4, 5, 6);
//        assertEquals(12, processor.sumOfEvenNumbers());
//    }
//
//    @homework.Test
//    void testMultiplyEachNumberByTwo() {
//        NumberProcessor processor = new NumberProcessor();
//        processor.addNumbers(1, 2, 3);
//        assertEquals(Arrays.asList(2, 4, 6), processor.multiplyEachNumberByTwo());
//    }
//
//    @homework.Test
//    void testFindMaxNumber() {
//        NumberProcessor processor = new NumberProcessor();
//        processor.addNumbers(1, 2, 3, 10, 4);
//        assertEquals(10, processor.findMaxNumber().orElseThrow(NoSuchElementException::new));
//    }
//
//    @homework.Test
//    void testGetOddNumbersAsString() {
//        NumberProcessor processor = new NumberProcessor();
//        processor.addNumbers(1, 2, 3, 4, 5);
//        assertEquals("1, 3, 5", processor.getOddNumbersAsString());
//    }
//
//    @homework.Test
//    void testGetAverage() {
//        NumberProcessor processor = new NumberProcessor();
//        processor.addNumbers(1, 2, 3, 4, 5);
//        assertEquals(3.0, processor.getAverage().orElseThrow(NoSuchElementException::new));
//    }
//}
