package Array;

import java.lang.reflect.Array;
//以float形式返回指定数组对象中的索引组件的值。
public class GetFloatAndArrayAndIndex {

    public static void main(String[] args) {
        float[] array = new float[]{1.0f,2.0f,3.0f};

        System.out.println("array[0] = " + Array.getFloat(array, 0));
        System.out.println("array[1] = " + Array.getFloat(array, 1));
        System.out.println("array[2] = " + Array.getFloat(array, 2));
    }

}
