package ExeptionsLesson.Homework03;

public class ImputErors {
    public static void eror(int key) {
        switch (key) {
            case -1:
                System.out.println("Вы ничего не ввели!");
                break;
            case -2:
                System.out.println("Вы ввели мало данных!");
                break;
            case -3:
                System.out.println("Вы ввели слишком много данных!");
                break;

        }
    }
}
