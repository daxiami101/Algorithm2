/**
 * 
 */
package jsonFileIO;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
public class InfoSingleTravel2{
	public static void main(String[] args) throws Exception {
		InfoSingleTravel info=new InfoSingleTravel();
		BeanInfo  bBeanObjInfo = Introspector.getBeanInfo(info.getClass());  
        PropertyDescriptor[] targetPds = bBeanObjInfo.getPropertyDescriptors();
        for (PropertyDescriptor targetPd : targetPds) {
			Method writeMethod = targetPd.getWriteMethod();
			System.out.println(writeMethod);
			Method readMethod = targetPd.getReadMethod();
			System.out.println(readMethod);
			System.out.println("=============");
        }
	}
}
