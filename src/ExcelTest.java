

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelTest {
	public static void main(String[] args) {
//		String dataSource="SHOUQI";
//		sta(dataSource);
		Map<Object,Object>map=new HashMap<>();
		map.put("早高峰", 0);
//		ExcelUtil.writeExcel(map, "/home/release/apps/dh/预约订单"+".xlsx");
		ByteArrayOutputStream os = new ByteArrayOutputStream();  
		String path="/home/release/apps/dh/预约订单"+".xlsx";
        byte[] content = os.toByteArray();  
        File file = new File(path);//Excel文件生成后存储的位置。  
        OutputStream fos  = null;  
        try  
        {  
            fos = new FileOutputStream(file);  
            fos.write(content);  
            os.close();  
            fos.close();  
        }catch (Exception e){  
            e.printStackTrace();  
        }            
	}

}
