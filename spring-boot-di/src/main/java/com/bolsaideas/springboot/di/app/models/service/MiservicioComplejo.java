package com.bolsaideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("miserviciocomplejo")
public class MiservicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complejo ...";
	}

}
