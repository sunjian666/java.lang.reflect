package Array;
import java.lang.reflect.Array;

//将指定数组对象的索引组件的值设置为指定的新值。
public class SetAndArrayAndIndexAndValue {

    public static void main(String[] args) {
        String[] stringArray = (String[]) Array.newInstance(String.class, 3);

        Array.set(stringArray, 0, "Mahesh");
        Array.set(stringArray, 1, "Ramesh");
        Array.set(stringArray, 2, "Suresh");

        System.out.println("stringArray[0] = " + Array.get(stringArray, 0));
        System.out.println("stringArray[1] = " + Array.get(stringArray, 1));
        System.out.println("stringArray[2] = " + Array.get(stringArray, 2));
    }

}
