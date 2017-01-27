package com.saxmaster896.Terminus.main;

public class UserNameDecorator extends TextDecorator implements IText {
	private String message;
	public UserNameDecorator(){
		message=super.getMessage();
	}
	@Override
	public void decorate(){
		String userID=ChatText.getUserID();
		message=userID+message;
	}
	public String getMessage(){
		return message;
	}
}
