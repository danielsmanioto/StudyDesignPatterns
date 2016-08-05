package com.danielsmanioto.singleton.config;


/**
 * Singleton
 * Garante que uma classe tenha somente uma instanciae fornece um ponto de acesso global a ela.
 * Criação de forma lazy
 * @author Daniel Smanioto
 *
 */
public class ConfigManagerLazySingleton {

	private static ConfigManagerLazySingleton instance;
	private String server;
	
	private ConfigManagerLazySingleton() {}
	
	public static synchronized ConfigManagerLazySingleton getInstance() {
		if(instance == null)
			instance = new ConfigManagerLazySingleton();
		
		return instance;
	}
	
	public String getServer() {
		return server;
	}
	
	public void setServer(String server) {
		this.server = server;
	}
	
}
