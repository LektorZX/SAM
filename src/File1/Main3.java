package File1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*1. Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.

2. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.

3. Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова

4. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.

5. Задан файл с java-кодом. Прочитать текст программы из файла и все слова public в объявлении атрибутов и методов
 класса заменить на слово private. Результат сохранить в другой заранее созданный файл.

6. Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.

*/
public class Main3 {
    private static final String VOWELS = "яёуаеиоюэы";
   public static void main(String[] args) throws FileNotFoundException,IOException  {
       q2();


       }
      static public void q1() throws FileNotFoundException {
           Path src = Paths.get("src", "test.txt");
           File f= src.toFile();//корень,папки через запятую.

          try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(f)))) {///try для автоматич закрытия потока с 7 явы
              while (scanner.hasNextLine()) {
                  System.out.println(scanner.nextLine());
              }
          }
       }
    static public void q2() throws IOException {
        Path src = Paths.get("src", "test2.txt");
        File f= src.toFile();//корень,папки через запятую.

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(f)))) {///try для автоматич закрытия потока с 7 явы
            while (scanner.hasNext()) {
                String t=scanner.next();
                if(qwe(t))
                System.out.println(scanner.next());
                else {}
            }
        }

    }
    private static boolean qwe(String str){

      return VOWELS.indexOf(Character.toLowerCase(str.charAt(0)))!=-1;

       // return VOWELS.contains(String.valueOf(str.charAt(0)).toLowerCase());


    }
    static public void q3(){

    }
    static public void q4(){

    }
    static public void q5(){

    }
    static public void q6(){

    }
}
