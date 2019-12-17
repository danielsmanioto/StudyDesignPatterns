package com.dsmanioto.agency.agency;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
	
	private String news;
	private List<Channel> channels = new ArrayList<>();
	
	public NewsAgency(Channel channel) {
		addObserver(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		for (Channel channel : this.channels) {
			channel.update(this.news);
		}
	}
	
	private void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
}
