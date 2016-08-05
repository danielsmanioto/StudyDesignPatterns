package com.danielsmanioto.singleton.config;


/**
 * Singleton
 * Garante que uma classe tenha somente uma instancia e fornece um ponto de acesso global a ela.
 * Criação de forma eager
 * @author Daniel Smanioto
 *
 */
public class ConfigManagerEagerNaoSingleton {

	private static ConfigManagerEagerNaoSingleton instance = new ConfigManagerEagerNaoSingleton();
	private String server;
	
	private ConfigManagerEagerNaoSingleton() {}
	
	public static ConfigManagerEagerNaoSingleton getInstance() {
		return instance;
	}
	
	public String getServer() {
		return server;
	}
	
	public void setServer(String server) {
		this.server = server;
	}
	
}
