package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		//URL url = new URL("https://post-phinf.pstatic.net/MjAyMTA1MThfMjgx/MDAxNjIxMzIzMTA3NDU0.fPhsZwTfwSzEVYaeCS3SCA4OBYXxsoJ1vt8IDkwxKcwg.wwncZJ20wzZP9uF-vLaLNzi7NjS4cTaD3Jo9C6rzX8cg.JPEG/lksjdflkjsld.jpg?type=w1200");
		URL url = new URL("https://post.naver.com/viewer/postView.nhn?volumeNo=31518158&memberNo=43209292");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
		System.out.println("query : " + query);
		System.out.println("ref : " + ref);
		
		/*
		InputStream in = url.openStream();	//source : html
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*8];
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Downloads\\test.jpg");
		while((readByteCount = in.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteCount);
		}
		fos.close();
		*/
		
		InputStream in = url.openStream();//source : html
		InputStreamReader isr = new InputStreamReader(in,"utf-8");	//"euc-kr"
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {	//한 줄씩 계속 읽음
			System.out.println(readLine);
		}
		br.close();
	}
}
