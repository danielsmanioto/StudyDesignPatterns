package com.dsmanioto.mementohistory.mementohistory;

import com.dsmanioto.mementohistory.mementohistory.implementation.Editor;
import com.dsmanioto.mementohistory.mementohistory.implementation.History;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Objects;

@SpringBootTest
class MementoHistoryApplicationTests {
	
	@Test
	void validaRestoreCorretamente() {
		var editor = new Editor();
		var history = new History();
		
		editor.setContent("a");
		history.push(editor.createState());
		
		editor.setContent("b");
		history.push(editor.createState());
		
		editor.setContent("c");
		editor.restore(history.pop());
		
		Assert.isTrue(editor.getContent().equals("b"));
	}
	
	@Test
	void validaInserirExibirEstado() {
		var editor = new Editor();
		var history = new History();
		
		editor.setContent("a");
		history.push(editor.createState());
		
		Assert.isTrue(editor.getContent().equals("a"));
	}
	
	@Test
	void validaExibirEstadoSemNenhumAdicionado() {
		var editor = new Editor();
		var history = new History();
		history.push(editor.createState());
		
		Assert.isTrue(Objects.isNull(editor.getContent()));
	}

}
