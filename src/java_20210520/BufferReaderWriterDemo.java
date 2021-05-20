package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileDemo-copy2.java");
			bw = new BufferedWriter(fw);
					
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				bw.write(readLine);	//readLine 변수에는 개행을 포함하지 않음.
				bw.newLine();	//개행을 넣어준다.(window - \r\n, unix - \n)
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
