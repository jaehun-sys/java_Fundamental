package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static String format(File f) {
		//1970년 1월 1일 00:00:00초부터 파일을 수정한 날까지의 시간을 밀리세컨드로 반환한 값
		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String format = sdf.format(cal.getTime());	//Calendar 객체를 Date 객체로 바꾸기.
		return format;
	}
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\test\\2021\\05\\18\\깃 풀링.docx");
		if(f1.mkdirs()) {
			System.out.println("디렉토리를 생성했습니다.");
		}
		else {
			System.out.println("이미 디렉토리가 존재합니다.");
		}
		
		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\깃 풀링.docx");
		long len = f2.length();
		System.out.printf("%d\n",len);
		boolean isFile = f2.isFile();	//isDirectory()
		if(isFile) {
			String path = f2.getPath();
			System.out.println(path);
			if(path.endsWith("zip")) {	//끝나는 글자(확장자 알아볼 때)
				System.out.println("압축 파일입니다.");
			}
			else if(path.endsWith("txt")) {
				System.out.println("텍스트 파일입니다.");
			}
			else if(path.endsWith("java")) {
				System.out.println("자바 파일입니다.");
			}
			else if(path.endsWith("docx")) {
				System.out.println("워드 파일입니다.");
			}
			System.out.println("파일입니다.");
		}
		else {
			System.out.println("디렉토리입니다.");
		}
		
		System.out.println(format(f2));
		
		File f3 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse2.zip");
		File f4 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse3.zip");
		f3.renameTo(f4);//f3파일을 f4파일 이름으로 변경
		
		String path = f4.getPath();
		String parent = f4.getParent();
		String name = f4.getName();
		System.out.println(path + ", " + parent + ", " + name);
		
		f4.delete();
		
		File f5 = new File("C:\\Users\\user\\eclipse-workspace\\java_Fundamental");
		f5.list();
		
		File[] files = f5.listFiles();
		for(int i=0; i<files.length; i++) {
			File f = files[i];
			if(f.isDirectory()) {
				String lastModified = format(f);
				String fileName = f.getName();
				System.out.println(fileName + "\t" + lastModified + "\t" + "파일폴더\n");
			}else if(f.isFile()) {
				String lastModified = format(f);
				String fileName = f.getName();
				long fileSize = f.length();
				System.out.println(fileName + "\t" + lastModified + "\t" + "파일\t" + fileSize + "\n");
			}
		}
	}
}
