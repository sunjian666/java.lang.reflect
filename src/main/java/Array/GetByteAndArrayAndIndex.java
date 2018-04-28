package Array;

import java.lang.reflect.Array;
//以字节形式返回指定数组对象中的索引组件的值。
public class GetByteAndArrayAndIndex {

    public static void main(String[] args) {
        byte[] array = new byte[]{1,2,3};

        System.out.println("array[0] = " + Array.getByte(array, 0));
        System.out.println("array[1] = " + Array.getByte(array, 1));
        System.out.println("array[2] = " + Array.getByte(array, 2));
    }

}
