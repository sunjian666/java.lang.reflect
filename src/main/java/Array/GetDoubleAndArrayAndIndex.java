package Array;

import java.lang.reflect.Array;
//以double形式返回指定的数组对象的索引组件的值。
public class GetDoubleAndArrayAndIndex {

    public static void main(String[] args) {
        double[] array = new double[]{1.0,2.0,3.0};
        System.out.println("array[0] = " + Array.getDouble(array, 0));
        System.out.println("array[1] = " + Array.getDouble(array, 1));
        System.out.println("array[2] = " + Array.getDouble(array, 2));
    }

}
