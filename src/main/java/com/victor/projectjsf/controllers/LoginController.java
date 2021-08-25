/**
 * 
 */
package com.victor.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

/**
 * @author vicher Permite controlar el funcionamiento con la pantalla
 *         login.xhtml
 */
@ManagedBean(name = "coneccion")
public class LoginController {
	/*
	 * Usuario que ingresa al login
	 */
	private String usuario;
	/*
	 * Contraseña ingresada en el login
	 */
	private String password;

	/*
	 * Metodo que permite ingresar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		if (usuario.equals("victor") && password.equals("1234567890")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtusuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La páguina no existe", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtusuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrecto", ""));
		}
	}

	public void redireccionar(String paguina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(paguina);
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
