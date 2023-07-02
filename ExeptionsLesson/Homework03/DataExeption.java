package ExeptionsLesson.Homework03;

public class DataExeption extends Exception {
    public DataExeption() {

    }

    public static void dataExeption(String data) {
        System.out.println("Не коректно указана дата рождения:" + data);
        System.out.println();
    }
}
