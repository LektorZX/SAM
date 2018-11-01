package File1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("test.txt");
       // file1.mkdirs();//создает дериктории если их нет для того что бы создать файл,ТОЛЬКО после этого создавать файл
        file1.createNewFile();//создали файл
        //File.separator  ставить вместо слешей что бы работало корректно везде
        //вместо сепаратора что бы удобно было прописывать путь -корень,папки-путь,файл
       // Path io=Paths.get("src","2","3","4","test.txt");
        // File file2 = io.toFile();

    }
}
