package jsonFileIO;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class ReadJsonTest {
	public static void main(String[] args) {
		System.out.println(ReadJsonTest.class.getPackage().getName());
//		String path="D:\\03lab\\12hadoop\\DCYY\\SHOUQI\\SHOUQI105";
		String path="/home/data/his/2018-06-11/DDPD/tjhtcykjyxgsbjfgs";
		File file=new File(path);
		JsonParser parser = new JsonParser();
		File[] files = file.listFiles();

		for(File f:files){
			String absolutePath=f.getAbsolutePath();
			try {
				JsonObject object = (JsonObject) parser.parse(new FileReader(absolutePath));
				JsonElement items = object.get("items");
				Gson gson=new Gson();
				Type type = new TypeToken<List<InfoSingleTravel>>(){}.getType();
				List<InfoSingleTravel> fromJson = gson.fromJson(items, type);
				for(InfoSingleTravel infoSingle:fromJson){
					System.out.println(infoSingle.getOrderNo());
				}
//				FileInputStream in=new FileInputStream(f);
//				InfoSingleTravel info=new InfoSingleTravel();
//				BeanInfo  bBeanObjInfo = Introspector.getBeanInfo(info.getClass());  
//	            PropertyDescriptor[] targetPds = bBeanObjInfo.getPropertyDescriptors();
//	            for (PropertyDescriptor targetPd : targetPds) {
//	    			Method writeMethod = targetPd.getWriteMethod();
//	    			System.out.println(writeMethod);
//	            }
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
