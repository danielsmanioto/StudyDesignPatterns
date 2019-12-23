package com.dsmanioto.device;

import com.dsmanioto.device.device.impl.Device;
import com.dsmanioto.device.device.impl.Radio;
import com.dsmanioto.device.device.impl.TV;
import com.dsmanioto.device.remote.impl.AdvancedRemote;
import com.dsmanioto.device.remote.impl.BasicRemote;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class DeviceApplicationTests {

	@Test
	void contextLoads() {
		testDevice(new TV());
		testDevice(new Radio());
	}
	
	
	public void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}
