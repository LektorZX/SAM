package Serializable1.DZ;

import Serializable1.inLine.SerialisationUtil123;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)  {
        try {
            UseFile.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
            ////////Сериализация


        Student feri = new Student("FERI", new Integer[]{8, 9, 3, 5, 6, 7,}, 9);
        Path src = Paths.get("src", "testPerson.b");
        try {
            SerialisationUtil123.serializeObject(src, feri);
            Student object =SerialisationUtil123.deserializeObject(src);
            System.out.println(object);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
