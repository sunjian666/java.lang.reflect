package AccessibleObject;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

//返回此元素上存在的所有注解。
public class GetAnnotations {

    public static void main(String[] args) throws NoSuchMethodException {
        AccessibleObject sampleMethod = SampleClass1.class.getMethod("sampleMethod");

        Annotation[] annotations = sampleMethod.getAnnotations();

        for(Annotation annotation : annotations){
            if(annotation instanceof CustomAnnotation1){
                CustomAnnotation1 customAnnotation = (CustomAnnotation1) annotation;
                System.out.println("name: " + customAnnotation.name());
                System.out.println("value: " + customAnnotation.value());
            }
        }
    }

}

@CustomAnnotation1(name="类上的名",  value = "类上的值")
class SampleClass1 {
    private String sampleField;

    @CustomAnnotation1(name="方法上的名",  value = "方法上的名")
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
@interface CustomAnnotation1 {
    public String name();
    public String value();
}
