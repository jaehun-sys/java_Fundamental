package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {	
			//1.FileInputStream과 FileOutputStream을 이용
			//1바이트 읽어서 1바이트 출력
			//파일 크기 : 11,756KB
			//경과 시간 : 56900(밀리세컨드)
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy.zip");
			/*
			int readByte = 0;
			
			long start = System.currentTimeMillis();
			while((readByte = fis.read())!= -1) {
				fos.write(readByte);
			}
			
			long end = System.currentTimeMillis();
			System.out.printf("경과 시간: %d초\n", (end - start));
			*/
			
			
			//2.BufferedInputStream과 BufferedOutputStream을 이용
			//1바이트 읽고 1바이트 출력.
			//파일 크기 : 11,756KB
			//경과 시간 : 439(밀리세컨드)
			//BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차있으면 출력
			//만약 다 채워져있지 않으면 출력하지 않음.
			//이런 경우, flush()를 호출하여 모두 출력해줘야 함.
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int readByte = 0;
			long start = System.currentTimeMillis();
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.printf("경과 시간: %d초\n", (end - start));
			
			
			//3.
			//경과 시간 : 19(밀리세컨드)
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*10];
			/*
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과 시간: %d초\n", (end - start));
			*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//안에꺼 부터 닫고 바깥거 닫음
				//(파일부터 닫고 그다음 버퍼 닫음)
				if (fis != null) fis.close();
				if (bis != null) bis.close();
				if (fos != null) fos.close();
				if (bos != null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
