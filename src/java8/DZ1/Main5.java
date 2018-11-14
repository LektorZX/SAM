package java8.DZ1;

import java8.Student;

import java.util.*;
import java.util.stream.Collectors;

/*5.	Дан класс Person с полями firstName, lastName, age.
Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
*/
public class Main5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(24, "Ivsnods"),
                new Student(34, "Ivsnodscvbcvbcvbcvb"),
                new Student(54, "Ivsnodsfffffff"),
                new Student(44, "Ivsnodscvbcvfghfg"),
                new Student(23, "Ivsnodsssdfdfdffdf"),
                new Student(65, "Ivsnodccvcvs"),
                new Student(26, "Ivsnodsssrrrr"),
                new Student(27, "Ivsnodsrrrrrrrrrrrrrrrrrr"));
        students.stream()
                .filter(per->per.getFirsName().length()<15)
                .max(Comparator.comparing(Student::getAge))//создает на ходу по полю которое поставить
                .ifPresent(System.out::println);

        Map<Integer, Student> collect = students.stream()
                .collect(Collectors.toMap(Student::getAge, it -> it));//создали коллекцию мап с ключ, значение обьект студента
        System.out.println(collect);
//по имени поставили
        Map<String, List<Student>> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::getFirsName, Collectors.toList()));
        System.out.println(collect1);

        System.out.println("Test peek start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Напечатать отладочную информацию по каждому элементу стрима

    }
}
