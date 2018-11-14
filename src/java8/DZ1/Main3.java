package java8.DZ1;
/*3.	Дана Map<String, Integer>. Найти
сумму всех значений, длина ключей которых меньше 7 символов.*/
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("123456", 2);
        map.put("1245600", 6);
        map.put("1234", 4);
        map.put("12356", 5);
        map.put("17345600", 24);
        map.put("12340", 1);
        var2(map);
        var1(map);


    }

    private static void var2(HashMap<String, Integer> map) {
        int reduce = map.entrySet().stream()
                .filter(it -> it.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .reduce(0, (acc, current) -> acc + current);//вставили свою функцию а+в и начинать считать от 0 элемента
        System.out.println(reduce);
    }

    private static void var1(HashMap<String, Integer> map) {
        int sum = map.entrySet().stream()//map.entrySet() как нод в дереве,-отдельно гетсет гет кей
                .filter(it -> it.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
