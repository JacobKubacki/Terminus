package com.saxmaster896.Terminus.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Terminus {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Socket interwebs=new Socket("127.0.0.1", 3000);
		BufferedReader inputReader=new BufferedReader(new InputStreamReader(System.in));
		OutputStream ostream=interwebs.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream, true);
		InputStream istream=interwebs.getInputStream();
		BufferedReader recieveRead=new BufferedReader(new InputStreamReader(istream));
		Util.printLogo();
		System.out.print("Welcome to Terminus! Please input your credentials: \n");
		String username=input.next();
		System.out.println("Please enter your password: \n");
		String password=input.next();
		while(Util.initLogIn(username, password)==1){
			username=input.next();
			password=input.next();
			if(Util.initLogIn(username, password)==1){
				//to be implemented later once networking is in place
			}
			if(Util.initLogIn(username, password)==0){
				break;
			}
		}
		System.out.print("Welcome, " +username + ", please select what you would like to do: \n");
		while(true){
			Util.printChoices();
			int choice=input.nextInt();
			switch(choice){
			case 1: Util.connect();
				break;
			case 2: System.out.println("This feature is upcoming.");
				break;
			case 3: Util.changeSettings();
				break;
			case 4: System.exit(0);
				break;
			default: System.out.println("Please try again...\n");
			}
		}
	}
}
