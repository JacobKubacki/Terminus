package com.saxmaster896.Terminus.main;

public class TextDecorator implements IText {
	private String message;
	public TextDecorator(String message){
		this.message=message;
	}
	@Override
	public void decorate(){
		TimeStampDecorator time=new TimeStampDecorator();
		UserNameDecorator user=new UserNameDecorator();
		user.decorate();
		time.decorate();
	}
	public String getMessage() {
		return message;
	}
}
