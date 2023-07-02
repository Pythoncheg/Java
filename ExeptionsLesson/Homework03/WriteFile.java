package ExeptionsLesson.Homework03;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeData(String data, String path) {
        System.out.println(path);
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
