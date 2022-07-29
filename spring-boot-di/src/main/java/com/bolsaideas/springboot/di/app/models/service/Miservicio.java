package com.bolsaideas.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

@Service("miservicio")
public class Miservicio implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante...";
	}

}
