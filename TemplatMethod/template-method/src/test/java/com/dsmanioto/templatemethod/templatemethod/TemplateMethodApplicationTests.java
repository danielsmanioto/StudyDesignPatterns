package com.dsmanioto.templatemethod.templatemethod;

import com.dsmanioto.templatemethod.templatemethod.implementation.AbstractClass;
import com.dsmanioto.templatemethod.templatemethod.implementation.Concrete1;
import com.dsmanioto.templatemethod.templatemethod.implementation.Concrete2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplateMethodApplicationTests {

	@Test
	void executaTemplateMethod() {
		AbstractClass concrete1 = new Concrete1();
		concrete1.templateMethod();
		concrete1.primitiveOperation1();
		concrete1.primitiveOperation1();
		
		AbstractClass concrete2 = new Concrete2();
		concrete2.templateMethod();
		concrete2.primitiveOperation1();
		concrete2.primitiveOperation1();
	}

}
