package java_20210521;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress i = InetAddress.getLocalHost();
		System.out.println("호스트 이름 : " + i.getHostName());
		System.out.println("IP : " + i.getHostAddress());
		
		InetAddress i2 = InetAddress.getByName("naver.com");
		System.out.println("호스트 이름 : " + i2.getHostName());
		System.out.println("IP : " + i2.getHostAddress());
		
	}
}
