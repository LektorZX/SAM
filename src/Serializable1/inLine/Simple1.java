package Serializable1.inLine;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data//сеттеры геттеры,иклс,хэш,стринг
@NoArgsConstructor

public class Simple1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String lastName;
    private transient int q=9;

    public Simple1(String name, String lastName, int q) {
        this.name = name;
        this.lastName = lastName;
        this.q = q;
    }
}
