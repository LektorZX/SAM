package java8.DZ1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*4.	Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
Пример: список {5, 2, 4, 2, 1}
Результирующая строка: "52421"
*/
public class Main4 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 4, 6, 5, 7, 8, 1);
        String collect = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(collect);

    }
}
