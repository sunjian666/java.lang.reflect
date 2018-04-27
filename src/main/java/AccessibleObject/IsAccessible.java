package AccessibleObject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

//方法获取此对象的可访问标志的值。
public class IsAccessible {

    public static void main(String[] args) throws NoSuchFieldException {
        AccessibleObject sampleField = SampleClass3.class.getDeclaredField("sampleField");
        System.out.println("sampleField.isAccessible: " + sampleField.isAccessible());
    }

}

@CustomAnnotation3(name="类上的名",  value = "类上的值")
class SampleClass3 {
    private String sampleField;

    @CustomAnnotation3(name="方法上的名",  value = "方法上的名")
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
@interface CustomAnnotation3 {
    public String name();
    public String value();
}