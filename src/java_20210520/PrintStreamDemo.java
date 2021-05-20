package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;//파일
		PrintStream ps1 = null;//모니터
		
		ps1 = System.out;
		ps1.println("Hello");
		ps1.println("안녕하세요");
		
		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			bis = new BufferedInputStream(fis);	//Stream chaining
			
			fos = new FileOutputStream("C:\\\\dev\\\\test\\\\2021\\\\05\\\\18\\\\apache-tomcat-9.0.46-copy1.zip");
			bos = new BufferedOutputStream(fos);	//Stream chaining
			
			//PrintStream
			//1. PrintStream의 메소드는 IOException 발생하지 않는다.
			//2. auto flush 기능을 가지고 있음. => true
			ps = new PrintStream(bos,true);	//Stream chaining
			
			int readByte = 0;
			while((readByte = bis.read()) != -1) {
				ps.write(readByte);
			}
			//ps.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//안에꺼 부터 닫고 바깥거 닫음
			//(파일부터 닫고 그다음 버퍼 닫음)
			try {
				if (fis != null) fis.close();
				if (bis != null) bis.close();
				
				if (fos != null) fos.close();
				if (ps != null) ps.close();	//프린트스트림은 버퍼보다 먼저 닫음
				if (bos != null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
