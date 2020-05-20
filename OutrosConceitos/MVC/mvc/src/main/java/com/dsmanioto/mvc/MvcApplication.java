package com.dsmanioto.mvc;

import com.dsmanioto.mvc.controller.Controlador;
import com.dsmanioto.mvc.model.Modelo;
import com.dsmanioto.mvc.view.Visao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		Visao visao = new Visao();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(visao, modelo);
		visao.setVisible(true);
	}

}
