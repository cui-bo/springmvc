package fr.dawan.springcore.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Contact implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private List<Telephone> telephones;
    private Map<Object, Object> mapObject;

    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Contact(Adresse adresse) {
        super();
        this.adresse = adresse;
    }

    public Contact(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
    }

    public Contact(String nom, String prenom, Adresse adresse) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Contact(String nom, String prenom, Adresse adresse, List<Telephone> telephones) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephones = telephones;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Contact(String nom, String prenom, Adresse adresse, Map<Object, Object> mapObject) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mapObject = mapObject;
    }

    @Override
	public String toString() {
		return "Contact{" +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", adresse=" + adresse +
				", telephones=" + telephones +
				", mapObject=" + mapObject +
				'}';
	}

	public Map<Object, Object> getMapObject() {
		return mapObject;
	}

	public void setMapObject(Map<Object, Object> mapObject) {
		this.mapObject = mapObject;
	}
}
