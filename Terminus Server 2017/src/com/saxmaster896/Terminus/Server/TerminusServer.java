package com.saxmaster896.Terminus.Server;

import java.io.*;
import java.net.*;

public class TerminusServer {

	public static void main(String[] args) throws IOException {
		ServerSocket terminus9000=new ServerSocket(3000);
		System.out.println("SERVER MESSAGE: READY FOR CHAT");
		Socket client=terminus9000.accept();
		BufferedReader inReader=new BufferedReader(newInputStreamReader(System.in));
		OutputStream ostream=client.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream, true);
		InputStream istream=client.getInputStream();
		BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
		
		String recievedMessage, sendMessage;
		while(true){
			if((recievedMessage=recievedRead.readLine())!= null){
				System.out.println(recievedMessage);
			}
			sendMessage = inReader.readLine();
			pwrite.println(sendMessage);
			pwrite.flush();
		}
	}

}
