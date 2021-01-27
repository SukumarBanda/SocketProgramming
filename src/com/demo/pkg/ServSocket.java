package com.demo.pkg;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class ServSocket {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Server started...");
		ServerSocket sc = new ServerSocket(9999);
		Socket s = sc.accept();
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println("Client data: "+str);
		
	}
}
