
package java_project.Lection03;

/**
 * Ex01_Object
 */
public class Ex01_Object {

    public static void main(String[] args) {
        Object o = 1; GetType(o);
        o = 1.2; GetType(o);
    }

    public static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}