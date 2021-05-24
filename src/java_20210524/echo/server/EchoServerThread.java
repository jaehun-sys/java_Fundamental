package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EchoServerThread implements Runnable {
	private Socket socket;

	public EchoServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {

			// 4. 클라이언트 통신할 수 있는 Socket 객체가 생성된다.
			InetAddress i = socket.getInetAddress();
			System.out.println("클라이언트가 접속했습니다[" + i.getHostAddress() + "]");

			// 5. Socket를 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
			// 객체 생성은 한번만 하면 됨.
			// 6-2 읽고.
			InputStream in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			// 6-3 다시 써줌.
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
			while (true) {
				String readLine = br.readLine();// 클라이언트로부터 읽고
				System.out.println("클라이언트 메세지 : " + readLine);// 출력하고
				bw.write(readLine);// 다시 보내고
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("클라이언트가 비정상적으로 종료했습니다.");
		}
	}

}
