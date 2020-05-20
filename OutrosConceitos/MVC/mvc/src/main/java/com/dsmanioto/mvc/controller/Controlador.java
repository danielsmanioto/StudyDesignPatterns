package com.dsmanioto.mvc.controller;

import com.dsmanioto.mvc.model.Modelo;
import com.dsmanioto.mvc.view.Visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	
	private Visao visao;
	private Modelo modelo;
	
	public Controlador(Visao visao, Modelo modelo) {
		this.visao = visao;
		this.modelo = modelo;
		
		this.visao.adicionarListener(new Listener());
	}
	
	private class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int numero1, numero2 = 0;
			numero1 = visao.getNumero1();
			numero2 = visao.getNumero2();
			
			modelo.somaNumeros(numero1, numero2);
			
			visao.setResultado(modelo.getValor());
		}
	}
}
