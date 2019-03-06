package jsonFileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class ReadJSON {

	/**
	 * 
	 * 通过解析器将test.json转换成JsonObject
	 *
	 * 
	 * 
	 * @param args
	 * 
	 */

	public static void main(String[] args) {

		// 将 test.json 的数据转换成 JSON 对象

		// 需要创建一个解析器，可以用来解析字符串或输入流
		
		JsonParser parser = new JsonParser();

		try {

			// 创建一个JSON对象，接收parser解析后的返回值

			// 使用parse()方法，传入一个Reader对象，返回值是JsonElement类型

			// 因为要读取文件，所以传入一个FileReader

			// JsonObject是JsonElement的子类，所以需要强转

			// 有异常抛出，使用 try catch 捕获
		    
			JsonObject object = (JsonObject) parser.parse(new FileReader("D:\\03lab\\12hadoop\\DCYY\\SHOUQI\\SHOUQI105\\SHOUQI_DCYY_REQ_20170826235500000.json"));

			// 先将两个外部的属性输出 category 和 pop

			// 先 get 到名称（键），返回的是 JsonElement，再 getAs 转换成什么类型的值

			// 依据 json 格式里的数据类型
			JsonElement items = object.get("items");

			Gson gson=new Gson();
			Type type = new TypeToken<List<InfoSingleTravel>>(){}.getType();
			List<InfoSingleTravel> fromJson = gson.fromJson(items, type);
			for(InfoSingleTravel infoSingle:fromJson){
				System.out.println(infoSingle.getOrderNo());
			}
//			System.out.println("pop=" + object.get("pop").getAsBoolean());

			// 接着读取test.json里的JSON数组，名称是languages（键）

			// 创建一个JsonArray

//			JsonArray array = object.get("languages").getAsJsonArray();
//
//			for (int i = 0; i < array.size(); i++) {
//
//				// 分隔线
//
//				System.out.println("-----------------");
//
//				// 创建一个JsonObject，从array的下标获取，get() 返回JsonElement类型
//
//				// 这里不用强转，而用 getAsJsonObject() 进行转换
//
//				JsonObject subObject = array.get(i).getAsJsonObject();
//
//				System.out.println("id=" + subObject.get("id").getAsInt());
//
//				System.out.println("name=" + subObject.get("name").getAsString());
//
//				System.out.println("ide=" + subObject.get("ide").getAsString());
//
//			}

		} catch (JsonIOException e) {

			e.printStackTrace();

		} catch (JsonSyntaxException e) {

			e.printStackTrace();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}

}