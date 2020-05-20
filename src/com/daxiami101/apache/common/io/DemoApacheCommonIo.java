package com.daxiami101.apache.common.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoApacheCommonIo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		InputStream in = new URL( "https://www.vocabulary.com/dictionary/ambiguous" ).openStream();
		 try {
		   InputStreamReader inR = new InputStreamReader( in );
		   BufferedReader buf = new BufferedReader( inR );
		   String line;
		   while ( ( line = buf.readLine() ) != null ) {
		     System.out.println( line );
		   }
		 } finally {
		   in.close();
		 }
	}
}
