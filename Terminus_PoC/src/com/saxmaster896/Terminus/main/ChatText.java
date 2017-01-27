package com.saxmaster896.Terminus.main;

public class ChatText implements IText {
	private static String USERID;
	private String message;
	public ChatText(String ID){
		USERID=ID;
		message=null;
	}
	@Override
	public void decorate() {
		TextDecorator decorator=new TextDecorator(message);
		decorator.decorate();
	}
	public static String getUserID() {
		return USERID;
	}
	@Override
	public String getMessage(){
		return message;
	}
}
