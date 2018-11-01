package Serializable1;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path src = Paths.get("src", "testPerson.b");

        Person person = new Manager("Ivan","Ivanov",BigDecimal.TEN);

        SerialisationUtil.serializeObject(src, person);
       Person object =SerialisationUtil.deserializeObject(src);
        System.out.println(object);

    }

}
