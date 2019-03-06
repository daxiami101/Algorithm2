package annotation.demo03;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
//		LeiMode annotation = AnnotationDemo.class.getAnnotation(LeiMode.class);  
//		System.out.println(annotation.value());  
		
//		Field[] fields = AnnotationDemo.class.getDeclaredFields();  
//        Field field = null;  
//        for(Field f : fields){  
//            if(f.getName().equals("itest")){  
//                field = f;  
//                break;  
//            }  
//        }  
//          
//        FiledMode annotation = field.getAnnotation(FiledMode.class);  
//        System.out.println(annotation.value()); 
        

//    	Field field = AnnotationDemo.class.getDeclaredField("itest");  
//        FiledMode annotation = field.getAnnotation(FiledMode.class);  
//          
//        System.out.println(annotation.value()); 
//        
//        
        Method[] methods = AnnotationDemo.class.getDeclaredMethods(); //可以获取私有方法和公有方法, getMethods() 获取公有方法  
        Method meth = null;  
        for(Method method : methods){  
            if(method.getName().equals("test")){  
                meth = method;  
                break;  
            }  
        }  
        Annotation annotation = meth.getAnnotations()[0];  
        TreahMode mode = (TreahMode) annotation;  
        System.out.println(mode.value());  
        
//        
//        
//        Method method = AnnotationDemo.class.getDeclaredMethod("test", null);//可以获取私有方法和公有方法  
//        System.out.println(method);  
//        Annotation[] annotations = method.getAnnotations();  
//        Annotation annotation = annotations[0];  
//        System.out.println(annotation);  
//          
//        TreahMode mode = (TreahMode) annotation;  
//        System.out.println(mode.value()); 
	}

	
}
