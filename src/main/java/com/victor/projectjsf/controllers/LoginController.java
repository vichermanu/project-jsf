/**
 * 
 */
package com.victor.projectjsf.controllers;

import javax.faces.bean.ManagedBean;

/**
 * @author vicher Permite controlar el funcionamiento con la pantalla
 *         login.xhtml
 */
@ManagedBean(name="coneccion")
public class LoginController {
	/*
	 * Usuario que ingresa al login
	 */
	private String usuario;
	/*
	 * Contraseña ingresada en el login
	 */
	private String password;
	
	public void ingresar() {
		System.out.println("Usuario: "+usuario);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {

		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
