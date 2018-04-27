package AccessibleObject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

//方法将此对象的可访问标志设置为指定的布尔值。 设置值为true表示反射对象应该在使用时抑制Java语言访问检查。 设置值为false表示反射对象应强制执行Java语言访问检查。
public class SetAccessibleAndFlag {

    public static void main(String[] args) throws NoSuchFieldException {
        AccessibleObject sampleField = SampleClass6.class.getDeclaredField("sampleField");
        System.out.println("sampleField.isAccessible: " + sampleField.isAccessible());
        sampleField.setAccessible(true);
        System.out.println("sampleField.isAccessible: " + sampleField.isAccessible());
    }

}

@CustomAnnotation6(name="类上的名",  value = "类上的值")
class SampleClass6 {
    private String sampleField;

    @CustomAnnotation6(name="方法上的名",  value = "方法上的名")
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
@interface CustomAnnotation6 {
    public String name();
    public String value();
}