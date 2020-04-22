package ru.alazarev.sorter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Class Sorter
 * <p>
 * Date: 22.04.2020
 *
 * @author a.lazarev
 */
public class Sorter {
    public static Map<Integer, Long> sortArrayByIncCountOccurrencesOfNumber(Integer[] array) {
        return Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
