package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        int a=88;
        test1(a);
        List<String> strings = Arrays.asList("12", "123", "142", "15", "126", "16", "112", "1192", "192");
        IntSummaryStatistics sum = Stream.of("12", "123", "142", "15", "126", "16", "112", "1192", "192")
                .map(t -> Integer.valueOf(t))//преобразов в Интеджер
                // .map(Integer::valueOf)---можно вот так
                .mapToInt(t -> t.intValue())//преобразов в инт
                //.mapToInt(Integer--класс(можно поставить свой статич)::intValue--функция--(можно поставить свою принимает инт,возвращает инт)
                .summaryStatistics();
        System.out.println(sum);



    }

    private static void test1(int a) {
        String q="11";

        List<String> strings = Arrays.asList("12", "123", "142", "15", "126", "16", "112", "1192", "192");
        strings.stream()
                .map(s->s+a)//конкат
                .map(s->Integer.valueOf(s))//перевели в инт
                .filter(s->s>10000)//фильтр все что больше 10000
                .skip(1)//пропустить значение
                //.sorted() если нет компербл то будет ошибка,в коллекциях есть и все сортирует(стандартные обьекты)
                .sorted()
                .forEach(s-> System.out.println(s));//вывели то что получили
    }
}
