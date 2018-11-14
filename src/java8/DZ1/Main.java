package java8.DZ1;
/*1.	Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.*/


import java8.Student;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Prim1();
        List<Student> students = Arrays.asList(new Student(35, "Ivan"), new Student(32, "Ivanon"));
students.stream()
        .filter(it->sheck(it.getAge(),it.getFirsName() ));

    }

    private static boolean sheck(Integer age,String firstName){
        return true;
    }

    private static void Prim1() {
        List<Integer> integers = Arrays.asList(1, 2, 5,  7,  9, 23, 35);
        OptionalDouble average = integers.stream()
                .filter(isEven())//нашли которые делятся с остатком
                .sorted()
                .filter(it -> it % 5 == 0)//без остатка на 5
                .mapToInt(Integer::intValue)//перевели в Инт
                .average();//в Инт вызвали среднее
        average.ifPresent(it-> System.out.println(it));//если он есть выводим
        // System.out.println(average); или так
    }

    private static Predicate<Integer> isEven() {
        return it->it%2!=0;
    }
}
