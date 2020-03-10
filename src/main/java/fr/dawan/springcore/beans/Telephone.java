package fr.dawan.springcore.beans;

public class Telephone {
    private String numero;

    public Telephone() {
    }

    public Telephone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
