package Serializable1.inLine;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.*;
import java.nio.file.Path;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SerialisationUtil123 {

    public static void serializeObject(Path path, Object object) throws IOException {//принимает файл и обьект-записывает в файл
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            outputStream.writeObject(object);
        }
    }

    public static <T> T deserializeObject(Path path) throws IOException, ClassNotFoundException {
        T result = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path.toFile())))) {
            result = (T) objectInputStream.readObject();
        }

        return result;
    }
}
