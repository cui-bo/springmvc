package fr.dawan.springcore.beans;

import java.io.Serializable;

public class Adresse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rue;
	private String ville;
	private int codePostale;
	
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Adresse : default constructeur");
	}
	public Adresse(String rue, String ville, int codePostale) {
		super();
		System.out.println("Adresse : constructeur Adresse avec 3 arguments");
		this.rue = rue;
		this.ville = ville;
		this.codePostale = codePostale;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	
	
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", codePostale=" + codePostale + "]";
	}
}
