package ExeptionsLesson.Homework03;

public class ParseExeption extends Exception {
    public ParseExeption(){

    }
    public static void parseException(String date){
        System.out.println("Ошибка! Не корректное значение:" + date);
        System.out.println();
    }
}
