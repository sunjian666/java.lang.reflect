package Array;

import java.lang.reflect.Array;
//以int形式返回指定数组对象的长度。
public class GetLengthAndArray {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,5};

        System.out.println("array length = " + Array.getLength(array));
    }

}
