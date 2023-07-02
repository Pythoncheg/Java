package ExeptionsLesson.Homework03;

import java.text.ParseException;
import java.util.HashMap;

public class ParseUserDate {
    public static HashMap<String, Object> parseDate() {
        UserInput input = new UserInput();
        String[] data = UserInput.input();
        HashMap<String, Object> dataDict = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                if (i.equals("f") || i.equals("F") || i.equals("m") || i.equals("M")) {
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
                        Integer.parseInt(arrDate[0]) > 31 || Integer.parseInt(arrDate[1]) < 0 || Integer.parseInt(arrDate[1]) > 12 || Integer.parseInt(arrDate[2]) < 0 || Integer.parseInt(arrDate[0]) > 2023) {
                    try {
                        throw new DataExeption();
                    } catch (DataExeption e) {
                        e.dataExeption(i);
                    }
                } else {
                    if (Integer.parseInt(arrDate[2]) % 4 == 0) { //проверяем високосный ли год
                        if (Integer.parseInt(arrDate[1]) == 1 || // Проверяем длинные месяцы на правильность
                                Integer.parseInt(arrDate[1]) == 3 || Integer.parseInt(arrDate[1]) == 5 || Integer.parseInt(arrDate[1]) == 7 || Integer.parseInt(arrDate[1]) == 9 || Integer.parseInt(arrDate[1]) == 10 || Integer.parseInt(arrDate[1]) == 12) {
                            if (Integer.parseInt(arrDate[0]) <= 31) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrDate[1]) == 2) { // Проверяю Февраль на правильность
                            if (Integer.parseInt(arrDate[0]) <= 29) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrDate[1]) == 4 || // Проверяю короткие месяцы на правильность
                                Integer.parseInt(arrDate[1]) == 6 || Integer.parseInt(arrDate[1]) == 8 || Integer.parseInt(arrDate[1]) == 11) {
                            if (Integer.parseInt(arrDate[0]) <= 30) {
                                flag = false;
                            }
                        }
                    } else {
                        if (Integer.parseInt(arrDate[1]) == 1 ||  // Проверяем не високосные года
                                Integer.parseInt(arrDate[1]) == 3 || Integer.parseInt(arrDate[1]) == 5 || Integer.parseInt(arrDate[1]) == 7 || Integer.parseInt(arrDate[1]) == 9 || Integer.parseInt(arrDate[1]) == 10 || Integer.parseInt(arrDate[1]) == 12) {
                            if (Integer.parseInt(arrDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrDate[2]) == 2) {
                            if (Integer.parseInt(arrDate[0]) < 29) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrDate[1]) == 4 || Integer.parseInt(arrDate[1]) == 6 || Integer.parseInt(arrDate[1]) == 8 || Integer.parseInt(arrDate[1]) == 11) {
                            if (Integer.parseInt(arrDate[0]) < 31) {
                                flag = false;
                            }
                        }
                    }
                    if (!flag) {
                        dataDict.put("date", i);
                    } else {
                        try {
                            throw new DataExeption();
                        } catch (DataExeption e) {
                            e.dataExeption(i);
                        }
                    }
                }
            } else if (i.matches("[0-9]+")) {
                dataDict.put("telNumber", i);
            } else if (i.matches("[A-Za-z]+")) {
                stringBuilder.append(i + " ");
            } else {
                try {
                    throw new ParseExeption();
                } catch (ParseExeption e) {
                    e.parseException(i);
                }
            }

        }
        String[] fio = String.valueOf(stringBuilder).split(" ");
        if (fio.length == 3) {
            dataDict.put("lastName", fio[0]);
            dataDict.put("firstName", fio[1]);
            dataDict.put("fatherName", fio[2]);
        }
        return dataDict;
    }
}



