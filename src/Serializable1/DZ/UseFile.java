package Serializable1.DZ;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class UseFile {


    private static Path src = Paths.get("src", "Serializable1", "DZ", "Stud.txt");
    private static Path src1 = Paths.get("src", "Serializable1", "DZ", "Stud2.txt");
    private static File f = src1.toFile();


    public static <T>void write(List<T> temp,File f){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f.getPath()))) {
            for (T s : temp) {
                bw.write(s+ "\r\n");
            }
        } catch (IOException ex) {
            System.out.println("ОШИБКА ПРИ ЗАПИСИ В ФАЙЛ!!!");

        }
    }
    public static void read() throws IOException {
        //List<String> strings = Files.readAllLines(src);  СЧИТАТЬ СРАЗУ ВСЕ СТРОКИ В КОЛЛЕКЦИЮ.
        List<Student> stud = new ArrayList<>();
        int q1=0;
        int res ;
        List<String>temp=new ArrayList<>();
        if (!f.exists()) {
            boolean newFile = f.createNewFile();
        }
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(src.toFile())))) {
            while (scanner.hasNext()) {
                String students = scanner.nextLine();//строка из файла
                String[] values = students.split(" ");//строка из файла разбина на по пробелам в массив
                Integer[] arr = new Integer[values.length];//массив для цифр из строки
                int t1 = 0;
                for (int i = 0; i < values.length - 1; i++) {//забираем цифры из строки
                    arr[i] = Integer.parseInt(values[i + 1]);
                }
                String studentName = values[0];//забираем имя
                res =Util.Calc(values);//считаем средний для данного чела
                if (res >= 7) {//если средний выше или равно 7 заносим в массив для записи в новый файл отличники
                    temp.add(students);
                    stud.add(new Student(studentName, arr, res));
                    q1++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        write(temp, f);

    }



}
