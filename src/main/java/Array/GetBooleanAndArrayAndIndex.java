package Array;

import java.lang.reflect.Array;

//以布尔值形式返回指定数组对象中的索引组件的值。
public class GetBooleanAndArrayAndIndex {

    public static void main(String[] args) {
        boolean[] array = (boolean[]) Array.newInstance(boolean.class, 3);

        Array.set(array, 0, false);
        Array.set(array, 1, true);
        Array.set(array, 2, true);

        System.out.println("array[0] = " + Array.getBoolean(array, 0));
        System.out.println("array[1] = " + Array.getBoolean(array, 1));
        System.out.println("array[2] = " + Array.getBoolean(array, 2));
    }


}
