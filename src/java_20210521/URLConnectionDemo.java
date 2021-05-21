package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL("https://post.naver.com/viewer/postView.nhn?volumeNo=31518158&memberNo=43209292");
		URLConnection urlCon = url.openConnection();
		
		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");
		
		System.out.println("cache-control : " + cacheControl);
		System.out.println("content-type : " + contentType);
		System.out.println("date : " + date);
		
		InputStream in = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(in,"utf-8");	//"euc-kr"
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {	//한 줄씩 계속 읽음
			System.out.println(readLine);
		}
		in.close();
		isr.close();
		br.close();
	}
}
