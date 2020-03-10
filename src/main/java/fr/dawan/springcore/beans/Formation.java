package fr.dawan.springcore.beans;

import java.io.Serializable;

public class Formation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String intitule;
	private int duree;
	private double prix;
	private String description;
	

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Formation : default constructeur");
	}


	public Formation(String intitule, int duree, double prix, String description) {
		super();
		System.out.println("Formation : constructeur avec 4 arguments");
		this.intitule = intitule;
		this.duree = duree;
		this.prix = prix;
		this.description = description;
	}
	
	public Formation(String intitule, int duree, double prix) {
		super();
		System.out.println("Formation : constructeur avec 3 arguments");
		this.intitule = intitule;
		this.duree = duree;
		this.prix = prix;
	}
	
	
	public String getIntitule() {
		return intitule;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Formation [intitule=" + intitule + ", duree=" + duree + ", prix=" + prix + ", description="
				+ description + ", toString=" + super.toString() + "]";
	}


	
}
