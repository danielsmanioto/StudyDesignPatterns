package com.danielsmanioto.pedido;

import java.util.Calendar;

/**
 * Representa um pedido
 * @author daniel
 *
 */
public class Pedido {

	private Integer id;
	private Calendar data;
	
	/**
	 * Construtor com todos os campos necessários
	 * @param id
	 * @param data
	 */
	public Pedido(Integer id, Calendar data) {
		this.id = id;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

}
