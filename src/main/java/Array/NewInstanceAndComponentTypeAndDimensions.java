package Array;

import java.lang.reflect.Array;

//创建具有指定组件类型和维度的新数组。
public class NewInstanceAndComponentTypeAndDimensions {

    public static void main(String[] args) {
        String[][] stringArray = (String[][]) Array.newInstance(String.class, 3,3);

        Array.set(stringArray[0], 0, "Mahesh");
        Array.set(stringArray[1], 1, "Ramesh");
        Array.set(stringArray[2], 2, "Suresh");

        System.out.println("stringArray[0][0] = " + Array.get(stringArray[0], 0));
        System.out.println("stringArray[1][1] = " + Array.get(stringArray[1], 1));
        System.out.println("stringArray[2][2] = " + Array.get(stringArray[2], 2));
    }

}
