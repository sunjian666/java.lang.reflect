package Array;

import java.lang.reflect.Array;
//以char形式返回指定数组对象中的索引组件的值。
public class GetCharAndArrayAndIndex {

    public static void main(String[] args) {
        char[] array = new char[]{'a','b','3'};

        System.out.println("array[0] = " + Array.getChar(array, 0));
        System.out.println("array[1] = " + Array.getChar(array, 1));
        System.out.println("array[2] = " + Array.getChar(array, 2));
    }

}
