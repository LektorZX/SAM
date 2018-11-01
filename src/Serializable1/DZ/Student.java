package Serializable1.DZ;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data//сеттеры геттеры,иклс,хэш,стринг
@NoArgsConstructor
//@AllArgsConstructor

public class Student implements Serializable  {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer [] num;
    private int sr;

    public Student(String name, Integer [] num, int sr) {
        this.name = name;
        this.num = num;
        this.sr = sr;
    }
}
