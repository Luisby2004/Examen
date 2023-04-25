package com.cibertec.models;

public class ModeloAreas {
	
	private int idareas;
	private String nom_area;
	private int cant_clien_area;
	
	
	public ModeloAreas() {
		super();
		}
	
	
	public ModeloAreas(int idareas, String nom_area, int cant_clien_area) {
		super();
		this.idareas = idareas;
		this.nom_area = nom_area;
		this.cant_clien_area = cant_clien_area;
	}


	public int getIdareas() {
		return idareas;
	}
	public void setIdareas(int idareas) {
		this.idareas = idareas;
	}
	public String getNom_area() {
		return nom_area;
	}
	public void setNom_area(String nom_area) {
		this.nom_area = nom_area;
	}
	public int getCant_clien_area() {
		return cant_clien_area;
	}
	public void setCant_clien_area(int cant_clien_area) {
		this.cant_clien_area = cant_clien_area;
	}
	
}
