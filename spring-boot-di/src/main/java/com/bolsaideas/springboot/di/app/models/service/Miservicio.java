package com.bolsaideas.springboot.di.app.models.service;

//@Service("miservicio")
public class Miservicio implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante...";
	}

}
