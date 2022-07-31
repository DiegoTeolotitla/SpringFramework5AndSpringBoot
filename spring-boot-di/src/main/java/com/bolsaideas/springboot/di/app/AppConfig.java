package com.bolsaideas.springboot.di.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsaideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsaideas.springboot.di.app.models.domain.Producto;
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

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto = new Producto("Camara sony", 100);
		Producto producto2 = new Producto("Bocicleta bianchi aro 26", 200);

		ItemFactura linea1 = new ItemFactura(producto, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);

		return Arrays.asList(linea1, linea2);
	}

	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Montor LG LCD 24", 250);
		Producto producto2 = new Producto("Montor LG LCD 25", 350);
		Producto producto3 = new Producto("Montor LG LCD 26", 450);
		Producto producto4 = new Producto("Montor LG LCD 27", 550);

		ItemFactura factura1 = new ItemFactura(producto1, 2);
		ItemFactura factura2 = new ItemFactura(producto2, 2);
		ItemFactura factura3 = new ItemFactura(producto3, 2);
		ItemFactura factura4 = new ItemFactura(producto4, 2);

		return Arrays.asList(factura1, factura2, factura3, factura4);
	}
}
