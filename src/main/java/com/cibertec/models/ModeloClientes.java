package com.cibertec.models;

public class ModeloClientes {
	
	private int idcliente;
	private String nom_cliente;
	private int idarea;
	private int telefono;
	private String direccion;
	private String correo;
	
	
	public ModeloClientes() {
		super();
		}

	
	public ModeloClientes(int idcliente, String nom_cliente, int idarea, int telefono, String direccion,
			String correo) {
		super();
		this.idcliente = idcliente;
		this.nom_cliente = nom_cliente;
		this.idarea = idarea;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}
	
	
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNom_cliente() {
		return nom_cliente;
	}
	public void setNom_cliente(String nom_cliente) {
		this.nom_cliente = nom_cliente;
	}
	public int getIdarea() {
		return idarea;
	}
	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

	
	

}
