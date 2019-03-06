package com.daxiami101.xml.xml2json;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stax.StAXResult;
import javax.xml.transform.stax.StAXSource;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLOutputFactory;
 
public class XML2JsonTools {

	@SuppressWarnings("restriction")
	public static void main(String[] args) throws TransformerException,
			XMLStreamException, IOException {
		//输入路径
		String inputPath="D://json//9999999901020001_9999999932020001_184659308.xml";
		File inputFile=new File(inputPath);
		InputStream input =new FileInputStream(inputFile);
//				XML2JsonTools.class.getResourceAsStream("/tools/9999999901020001_9999999932020001_184659308.xml");
		File file=new File("D://1.json");//输出路径
		OutputStream output = new FileOutputStream(file);//System.out;
		JsonXMLConfig config = new JsonXMLConfigBuilder().autoArray(false)
				.autoPrimitive(true).prettyPrint(true).build();
		try {
			XMLStreamReader reader = XMLInputFactory.newInstance()
					.createXMLStreamReader(input);
			Source source = new StAXSource(reader);
			XMLStreamWriter writer = new JsonXMLOutputFactory(config)
					.createXMLStreamWriter(output);
			Result result = new StAXResult(writer);
			
			TransformerFactory.newInstance().newTransformer()
					.transform(source, result);
			System.out.println("============完成");
		} finally {
			output.close();
			input.close();
		}
	}
}
