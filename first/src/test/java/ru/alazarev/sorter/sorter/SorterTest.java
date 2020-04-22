package ru.alazarev.sorter.sorter;

import org.junit.jupiter.api.Test;
import ru.alazarev.sorter.Sorter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class SorterTest
 * <p>
 * Date: 22.04.2020
 *
 * @author a.lazarev
 */
class SorterTest {
    private Integer[] readIntegerArrayFromFile(File file) {
        List<Integer> list = new ArrayList<>();
        try (Scanner readerFromFile = new Scanner(file)) {
            while (readerFromFile.hasNextInt()) {
                list.add(readerFromFile.nextInt());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (Integer[]) list.toArray();
    }

    private void generateFileWithRandomNumbers(File file, long generatedArraySize,
                                               int maxIntBoundInRandom) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            int percent = 1;
            for (long i = 0; i < generatedArraySize; i++) {
                fileWriter.write(new Random().nextInt(maxIntBoundInRandom + 1) + " ");
                if (i % (generatedArraySize / 100) == 0 && i != 0) {
                    fileWriter.write(System.lineSeparator());
                    System.out.println(++percent);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void timer(PrintStream out, Instant startTime, Instant endTime, String endMessage) {
        System.out.println(endMessage + " " + Duration.between(startTime, endTime)
                .toString().substring(2));
    }

    @Test
    public void stressTest() {
        long generatedArraySize = 100000000;
        File file = new File("numbers.txt");
        Instant start = Instant.now();
        generateFileWithRandomNumbers(file, generatedArraySize, 0);
        timer(System.out, start, start = Instant.now(), "End generate file -");
        Integer[] res = readIntegerArrayFromFile(file);
        timer(System.out, start, start = Instant.now(), "End read file -");
        Map<Integer, Long> m = Sorter.sortArrayByIncCountOccurrencesOfNumber(res);
        timer(System.out, start, Instant.now(), "End sort array -");
        file.delete();
        assertEquals(generatedArraySize, m.get(0));
    }

    @Test
    public void whenSortArrayWithTwo1AndThree2AndFour3Then() {
        Map<Integer, Long> result = Sorter.sortArrayByIncCountOccurrencesOfNumber(new Integer[]{1, 1, 2, 2, 2, 3, 3, 3, 3});
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
    }

}