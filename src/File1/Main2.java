package File1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File f=Paths.get("src","test.txt").toFile();//корень,папки через запятую.
//        FileInputStream fileInputStream = new FileInputStream(f);
//        fileInputStream. ///читает по байтам
       // BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(f)); ДОБАВИЛИ буфер
        //
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(f)))) {///try для автоматич закрытия потока с 7 явы
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
       //     scanner.close();  если закрывать самому. через блок finally
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //--------------------------------------для 8 явы
        Path src = Paths.get("src", "test.txt");
        File f1= src.toFile();//корень,папки через запятую.

        List<String> strings = Files.readAllLines(src);//создается throws IOException в обьявлении main
        System.out.println(strings);

    }
}
