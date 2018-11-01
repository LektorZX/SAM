package Serializable1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

@Data//сеттеры геттеры,иклс,хэш,стринг
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Manager extends Person {
    private static final long serialVersionUID = 27657657657L;
    private BigDecimal t;


    public Manager(String name, String lastName, BigDecimal t) {
        super(name, lastName);
        this.t = t;
    }
//МЕТОДЫ ДЛЯ ЧТЕНИЯ ЗАПИСИ ОБЬЕКТА В/ИЗ ФАЙЛА,МОЖНО ПОСМОТРЕТЬ В ДЕБАГЕ
    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        this.t=BigDecimal.valueOf(50000L);
        System.out.println();

    }
    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        System.out.println();
    }
    //проверка синглтон
    private Object readResolve(){
        return this;//если сингл то вернуть обьект синглтона а не тот который мы вытянули ииз файла
    }
}
