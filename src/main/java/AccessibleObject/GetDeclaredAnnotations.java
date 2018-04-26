package AccessibleObject;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

//返回此元素上直接存在的所有注解。
public class GetDeclaredAnnotations {

    public static void main(String[] args) throws NoSuchMethodException {
        AccessibleObject sampleMethod = SampleClass2.class.getMethod("sampleMethod");

        Annotation[] declaredAnnotations = sampleMethod.getDeclaredAnnotations();

        for(Annotation annotation : declaredAnnotations){
            if(annotation instanceof CustomAnnotation2){
                CustomAnnotation2 customAnnotation = (CustomAnnotation2) annotation;
                System.out.println("name: " + customAnnotation.name());
                System.out.println("value: " + customAnnotation.value());
            }
        }
    }

}

@CustomAnnotation2(name="类上的名",  value = "类上的值")
class SampleClass2 {
    private String sampleField;

    @CustomAnnotation2(name="方法上的名",  value = "方法上的名")
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
@interface CustomAnnotation2 {
    public String name();
    public String value();
}
