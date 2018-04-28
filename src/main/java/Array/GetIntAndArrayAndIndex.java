package Array;
import java.lang.reflect.Array;
//以int形式返回指定数组对象中的索引组件的值。
public class GetIntAndArrayAndIndex {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};

        System.out.println("array[0] = " + Array.getInt(array, 0));
        System.out.println("array[1] = " + Array.getInt(array, 1));
        System.out.println("array[2] = " + Array.getInt(array, 2));
    }

}
