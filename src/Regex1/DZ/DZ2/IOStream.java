package Regex1.DZ.DZ2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOStream {

    public static List Input() throws IOException {
        Path src = Paths.get("src", "test.txt");
        File f1= src.toFile();//корень,папки через запятую.
        List<String> strings = Files.readAllLines(src);//создается throws IOException в обьявлении main
        return strings;
    }
    public static void write(List<String> temp){
        Path src = Paths.get("src", "test222.txt");
        File f1= src.toFile();//корень,папки через запятую.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f1.getPath()))) {
            for (String s : temp) {
                bw.write(s+"\r\n");
            }
        } catch (IOException ex) {
            System.out.println("ОШИБКА ПРИ ЗАПИСИ В ФАЙЛ!!!");
        }
    }



}
