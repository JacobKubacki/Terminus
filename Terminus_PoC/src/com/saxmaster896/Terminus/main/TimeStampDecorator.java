package com.saxmaster896.Terminus.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeStampDecorator extends TextDecorator implements IText {
	private String message;
	public TimeStampDecorator(){
		message=super.getMessage();
	}
	@Override
	public void decorate(){
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		message=timestamp+message;
	}
}
