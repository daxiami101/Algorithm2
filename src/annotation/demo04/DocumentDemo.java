package annotation.demo04;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface DocumentA {
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface DocumentB {
}

@DocumentA
class A{ }

class B extends A{ }

@DocumentB
class C{ }

class D extends C{ }

//测试
public class DocumentDemo {

    public static void main(String... args){
        A instanceA=new B();
        System.out.println("已使用的@Inherited注解:"+Arrays.toString(instanceA.getClass().getAnnotations()));

        C instanceC = new D();

        System.out.println("没有使用的@Inherited注解:"+Arrays.toString(instanceC.getClass().getAnnotations()));
    }

    /**
     * 运行结果:
     已使用的@Inherited注解:[@com.zejian.annotationdemo.DocumentA()]
     没有使用的@Inherited注解:[]
     */
}