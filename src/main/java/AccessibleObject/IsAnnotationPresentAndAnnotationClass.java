package AccessibleObject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

//如果此元素上存在指定类型的注解，则返回true，否则返回false。
public class IsAnnotationPresentAndAnnotationClass {

    public static void main(String[] args) throws NoSuchMethodException {
        AccessibleObject sampleMethod = SampleClass4.class.getMethod("sampleMethod");
        System.out.println("此元素上是否存在指定类型的注解: "
                + sampleMethod.isAnnotationPresent(CustomAnnotation4.class));
    }

}

@CustomAnnotation4(name="类上的名",  value = "类上的值")
class SampleClass4 {
    private String sampleField;

    @CustomAnnotation4(name="方法上的名",  value = "方法上的名")
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
@interface CustomAnnotation4 {
    public String name();
    public String value();
}
