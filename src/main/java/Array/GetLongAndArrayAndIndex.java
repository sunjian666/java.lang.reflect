package Array;

import java.lang.reflect.Array;

//以long形式返回指定数组对象中的索引组件的值。
public class GetLongAndArrayAndIndex {

    public static void main(String[] args) {
        long[] array = new long[]{1,2,3};

        System.out.println("array[0] = " + Array.getLong(array, 0));
        System.out.println("array[1] = " + Array.getLong(array, 1));
        System.out.println("array[2] = " + Array.getLong(array, 2));
    }

}
