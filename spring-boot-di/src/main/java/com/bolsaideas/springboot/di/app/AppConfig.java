package com.bolsaideas.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsaideas.springboot.di.app.models.service.IServicio;
import com.bolsaideas.springboot.di.app.models.service.Miservicio;
import com.bolsaideas.springboot.di.app.models.service.MiservicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiSerivicio() {
		return new Miservicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarServicioComplejo() {
		return new MiservicioComplejo();
	}
}
