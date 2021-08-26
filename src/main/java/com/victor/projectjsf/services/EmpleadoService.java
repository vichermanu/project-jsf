/**
 * 
 */
package com.victor.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.victor.projectjsf.entity.Empleado;

/**
 * @author vicher 
 * Clase que permite realizar la logica de negocio para empleado
 * @return {@link Empleado} lista de empleados
 */
public class EmpleadoService {
	/*
	 * metodo que permite consultar la lista de empleados de empresas de TI
	 */
	public List<Empleado> consultarEmpleados() {
		// genera la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();

		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();

		empleadoIBM.setNombre("Luis");
		empleadoIBM.setPrimerApellido("Ugalde");
		empleadoIBM.setSegundoApellido("Flores");
		empleadoIBM.setPuesto("CeO");
		empleadoIBM.setEstatus(true);

		empleadoMicrosoft.setNombre("Victor");
		empleadoMicrosoft.setPrimerApellido("perez");
		empleadoMicrosoft.setSegundoApellido("martinez");
		empleadoMicrosoft.setPuesto("deloper");
		empleadoMicrosoft.setEstatus(true);

		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Rojas");
		empleadoApple.setSegundoApellido("Churubiates");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);

		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);

		return empleados;
	}
}
