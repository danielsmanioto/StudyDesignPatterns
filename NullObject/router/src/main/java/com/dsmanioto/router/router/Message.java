package com.dsmanioto.router.router;

public class Message {
	
	private StringBuilder text;
	
	public Message() {
		this.text = new StringBuilder();
	}
	
	public StringBuilder getText() {
		return text;
	}
	
	public void setText(StringBuilder text) {
		this.text = text;
	}
	
}
