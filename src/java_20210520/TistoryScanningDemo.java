package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TistoryScanningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://jamesdreaming.tistory.com/99");
		InputStream in = url.openStream();	//외부 네트워크와 오픈 스트림. html과 연결됨.
		InputStreamReader isr = new InputStreamReader(in,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\tistory.html");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
		
		
		
	}
}
