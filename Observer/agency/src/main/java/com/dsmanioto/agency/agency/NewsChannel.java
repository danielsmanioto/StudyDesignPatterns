package com.dsmanioto.agency.agency;

public class NewsChannel implements Channel {
	
	private String news;
	
	@Override
	public void update(String message) {
		this.news = message;
	}
	
	public String getNews() {
		return news;
	}
	
}
