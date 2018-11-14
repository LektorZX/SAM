package java8.DZ1;
/*Дан список строк. Найти количество уникальных строк длиной более 8 символов.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("qweqweqwe ", "asdasdasdasd ", "xcvx ", "dfgdfgdfgdfg ",
                "fghfghfgh ", "vbnbn ", " rtyrtyrty", "cvbcvb ", "sdfsdf ");
        List<String> collect = strings.stream()
                .filter(it -> it.length() >= 8)
                .distinct()//убирает повторяющиеся элементы
                // .forEach(it-> System.out.println(it));//вывод на экран
                .collect(Collectors.toList());//вернуть коллекцию обработ значений
        System.out.println(collect);


    }
}
