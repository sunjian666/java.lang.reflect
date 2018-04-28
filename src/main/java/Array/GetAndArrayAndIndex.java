package Array;

import java.lang.reflect.Array;

//以对象形式返回指定数组对象中的索引组件的值。
public class GetAndArrayAndIndex {

    public static void main(String[] args) {
        String[] stringArray = (String[]) Array.newInstance(String.class, 3);

        Array.set(stringArray, 0, "第一个");
        Array.set(stringArray, 1, "第二个");
        Array.set(stringArray, 2, "第三个");

        System.out.println("stringArray[0] = " + Array.get(stringArray, 0));
        System.out.println("stringArray[1] = " + Array.get(stringArray, 1));
        System.out.println("stringArray[2] = " + Array.get(stringArray, 2));
    }

}
