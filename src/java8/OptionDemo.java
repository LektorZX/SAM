package java8;

import java.util.Optional;

public class OptionDemo {
    public static void main(String[] args) {
        Student student = new Student(35,"Ivan");
        Optional.ofNullable(student)
                .map(it->it.getFirsName())
                .ifPresent(it-> System.out.println(it));

    }
}
