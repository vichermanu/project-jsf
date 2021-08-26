package com.victor.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.victor.projectjsf.entity.Empleado;
import com.victor.projectjsf.services.EmpleadoService;

/**
 * 
 * @author vicher clase controller quue se encarga de procesar informacion para
 *         la pantalla principal
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/*
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	/*
	 * Servicio con los metodos que realizan la logica de negocios de empleados
	 */

	private EmpleadoService empleadoService = new EmpleadoService();

	/*
	 * metodo que se encarga de inicializar la informacion de la pantalla
	 * principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	
	
	
	
	/*
	 * Metodo que consulta la lista de empleado
	 */
	public void consultarEmpleados() {
		this.empleados = empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
}
