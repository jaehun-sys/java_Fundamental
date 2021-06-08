package java_20210608;
import java.io.File;
public class FileDemo {
	public static void main(String[] args) {
		
		File f = new File("C:\\dev\\test\\2021\\05\\18\\apache.zip");
		long len = f.length();
		System.out.printf("%,dK %n",len/1024);	//byte -> Kbyte
		
		String fileName = f.getName(); //file의 이름을 얻어오는 메소드
		System.out.println(fileName);
		
		String name = fileName.substring(0,fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(name);
		System.out.println(extension);
		
		String parentPath = f.getParent();
		System.out.println(parentPath);
		
		File f2 = new File(parentPath,System.currentTimeMillis()+"."+extension);
		f.renameTo(f2);
	}
}
