package ExeptionsLesson.Homework03;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String fileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = ParseUserDate.parseDate();
        while (data.size() != 6) {
            data = ParseUserDate.parseDate();
        }
        fileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : data.keySet()) {
            stringBuilder.append(data.get(str));
            stringBuilder.append(" ");
        }

        System.out.println(data);
        String filePath = fileName;
        writeFile.writeData(String.valueOf(stringBuilder), filePath);
    }
}
