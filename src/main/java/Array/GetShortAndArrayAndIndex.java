package Array;

import java.lang.reflect.Array;

//以short形式返回指定数组对象中的索引组件的值。
public class GetShortAndArrayAndIndex {

    public static void main(String[] args) {
        short[] array = new short[]{1,2,3};

        System.out.println("array[0] = " + Array.getShort(array, 0));
        System.out.println("array[1] = " + Array.getShort(array, 1));
        System.out.println("array[2] = " + Array.getShort(array, 2));
    }

}
