package java_project.lection02;

import java.io.File;

public class program {
    public static void main(String[] args) {
        try {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/java_project/lection02/test2.txt");
        String pathFileNew = pathProject.concat("/java_project/lection02/test.txt");
        File f = new File(pathFile);
        File a = new File(pathFileNew);
        f.renameTo(a);
        // f.createNewFile();
        System.out.println("try");
        } catch (Exception e) {
            System.err.println(e);
        }
        finally {
            System.out.println("Финал");
        }

    }
}
