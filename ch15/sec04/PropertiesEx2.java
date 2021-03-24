package ch15.sec04;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx2 {

	public static void main(String[] args) throws Exception {
		// country.properties 파일 내용 읽어서 출력
		Properties properties = new Properties();
		
		// 패키지 경로 : "/패키지명/패키지명/파일명"
		// /ch13/sec01.country.properties...
		String path = PropertiesEx2.class.getResource("country.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String country = properties.getProperty("country");
		String language = properties.getProperty("language");
		
		System.out.println("country : " + country);
		System.out.println("language : " + language);
	
	}

}
