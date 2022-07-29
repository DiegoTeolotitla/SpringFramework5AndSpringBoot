package com.bolsaideas.springboot.di.app.models.service;

//@Primary
//@Service("miserviciocomplejo")
public class MiservicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complejo ...";
	}

}
