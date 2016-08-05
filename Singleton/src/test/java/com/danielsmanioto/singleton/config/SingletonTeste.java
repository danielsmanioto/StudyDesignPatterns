package com.danielsmanioto.singleton.config;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTeste {

	private static final String server = "192.168.0.10";

	@Test
	public void eager() {
		ConfigManagerEagerNaoSingleton c = ConfigManagerEagerNaoSingleton.getInstance();
		c.setServer(server);
		assertEquals(server, c.getServer());
	}

	@Test
	public void lazy() {
		ConfigManagerEagerNaoSingleton c = ConfigManagerEagerNaoSingleton.getInstance();
		c.setServer(server);
		assertEquals(server, c.getServer());
	}

}
