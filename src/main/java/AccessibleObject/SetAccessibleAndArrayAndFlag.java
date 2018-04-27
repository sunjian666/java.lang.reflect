package AccessibleObject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

//方法是通过单个安全检查(效率)来设置对象数组的可访问标志的便利方法。
public class SetAccessibleAndArrayAndFlag {

    public static void main(String[] args) throws NoSuchFieldException {
        AccessibleObject sampleField = SampleClass5.class.getDeclaredField("sampleField");
        System.out.println("sampleField.isAccessible: " + sampleField.isAccessible());

        AccessibleObject[] array = new AccessibleObject[1];
        array[0] = sampleField;

        AccessibleObject.setAccessible(array, true);
        System.out.println("sampleField.isAccessible: " + sampleField.isAccessible());
    }

}

@CustomAnnotation5(name="类上的名",  value = "类上的值")
class SampleClass5 {
    private String sampleField;

    @CustomAnnotation5(name="方法上的名",  value = "方法上的名")
    public String sampleMethod(){
        return "sample";
    }

    public String getSampleField() {
        return sampleField;
    }

    public void setSampleField(String sampleField) {
        this.sampleField = sampleField;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation5 {
    public String name();
    public String value();
}