package fr.dawan.springcore.beans;

import java.io.Serializable;

public class Stagiaire extends Contact implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String code;

    public Stagiaire() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Stagiaire(String code) {
        this.code = code;
    }

    public Stagiaire(String nom, String prenom) {
        super(nom, prenom);
    }

    public Stagiaire(String nom, String prenom, Adresse adresse) {
        super(nom, prenom, adresse);
    }


    public Stagiaire(String nom, String prenom, Adresse adresse, String code) {
        super(nom, prenom, adresse);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
                "code='" + code + '\'' +
                "super ='" + super.toString() + '\'' +
                '}';
    }

}
