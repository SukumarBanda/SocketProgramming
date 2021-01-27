package com.demo.pkg;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class CliScoket {

	public static void main(String[] args) throws  IOException {
		
		
		String ip = "localhost";
		int port = 9999;
		
		Socket sc= new Socket(ip,port);
		String str = "sukumar";
		
		OutputStreamWriter os = new OutputStreamWriter(sc.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		
		out.write(str);
		os.flush();
		System.out.println("Client terminated...");
		
	}
}
