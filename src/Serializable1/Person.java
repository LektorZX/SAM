package Serializable1;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data//сеттеры геттеры,иклс,хэш,стринг
@NoArgsConstructor
//@AllArgsConstructor

public class Person implements Serializable {
    private static final long serialVersionUID=1987987987978L;
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
