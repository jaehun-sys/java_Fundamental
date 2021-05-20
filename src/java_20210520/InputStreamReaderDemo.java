package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;//source가 키보드인 경우
		/*
		byte[] b = new byte[100];
		int readByteCount = 0;
		while((readByteCount = in.read(b)) != -1){
			String message = new String(b,0,readByteCount);
			if(message != null && message.trim().equals("quit")) break;//while 탈출문
			System.out.print(new String(b,0,readByteCount));
			System.out.print("입력하세요>");
		}
		*/
		InputStream i = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\message.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = null;
		System.out.print("입력하세요>");
		while((readLine = br.readLine()) != null) {
			if(readLine != null && readLine.equals("quit")) break;
			System.out.println(readLine);	//readLine은 개행이 안붙음. trim()할 필요가 없다.
			bw.write(readLine);
			bw.newLine();
			System.out.print("입력하세요>");
		}
		bw.flush();
		
	}
}
