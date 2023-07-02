package ExeptionsLesson.Homework03;

public class SexException extends Exception {
    public SexException() {

    }
    public static void sexExeption(String data) {
        System.out.println("Вы указали не верный пол:" + data);
    }
}
