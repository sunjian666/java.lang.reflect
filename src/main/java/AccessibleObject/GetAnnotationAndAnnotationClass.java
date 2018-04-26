package AccessibleObject;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

//通过反射获取的方法上的注解类获取注解类中的属性
public class GetAnnotationAndAnnotationClass {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        AccessibleObject sampleMethod = SampleClass.class.getMethod("sampleMethod");
        Annotation annotationClass = SampleClass.class.getAnnotation(CustomAnnotation.class);

        if(annotationClass instanceof CustomAnnotation){
            CustomAnnotation customAnnotation = (CustomAnnotation) annotationClass;
            System.out.println("name: " + customAnnotation.name());
            System.out.println("value: " + customAnnotation.value());
        }

            Annotation annotation = sampleMethod.getAnnotation(CustomAnnotation.class);
        if(annotation instanceof CustomAnnotation){  //判断内存中实际对象A是不是B类型
            CustomAnnotation customAnnotation = (CustomAnnotation) annotation;
            System.out.println("name: " + customAnnotation.name());
            System.out.println("value: " + customAnnotation.value());
        }
    }

}

@CustomAnnotation(name="类上的名",  value = "类上的值")
class SampleClass {
    private String sampleField;

    @CustomAnnotation(name="方法上的名",  value = "方法上的名")
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
@interface CustomAnnotation {
    public String name();
    public String value();
}