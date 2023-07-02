package ExeptionsLesson.Homework03;

import java.util.HashMap;

public class ParseUserDate {
    public HashMap<String, Object> parseDate() {
        UserInput input = new UserInput();
        String[] data = UserInput.input();
        HashMap<String, Object> dataDict = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                if (i.equals("f") || i.equals("F") ||
                        i.equals("m") || i.equals("M")) {
                    dataDict.put("sex", i);
                } else {
                    try {
                        throw new SexException();
                    } catch (SexException e) {
                        e.sexExeption(i);
                    }
                }
            } else if (i.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrDate = i.split("\\.");
                boolean flag = true;
                if (Integer.parseInt(arrDate[0]) < 0 || // Проверка на правильность дней, месяцев и года.
                        Integer.parseInt(arrDate[0]) > 31 ||
                        Integer.parseInt(arrDate[1]) < 0 ||
                        Integer.parseInt(arrDate[1]) > 12 ||
                        Integer.parseInt(arrDate[2]) < 0 ||
                        Integer.parseInt(arrDate[0]) > 2023) {
                    try {
                        throw new DataExeption();
                    } catch (DataExeption e) {
                        e.dataExeption(i);
                    }
                } else {
                    if (Integer.parseInt(arrDate[2]) % 4 == 0) { //проверяем високосный ли год

                    }
                }
            }

        }
    }
}
