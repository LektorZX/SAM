package Serializable1.inLine;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Simple1 simple1=new Simple1("Ket","Frolin",5);
        Path src = Paths.get("src", "testPerson.b");
        SerialisationUtil123.serializeObject(src, simple1);
    Simple1 object =SerialisationUtil123.deserializeObject(src);
        System.out.println(object);
    }


}
