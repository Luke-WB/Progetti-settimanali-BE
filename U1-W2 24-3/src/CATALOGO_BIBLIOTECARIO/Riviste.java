package CATALOGO_BIBLIOTECARIO;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Riviste {
    private @Getter int codiceISBN;
    private String titolo;
    private @Getter int annoPubblicazione;
    private int numeroPagine = 60;
    private Periodicita Periodicita;

    public Riviste(int cod, String t, int d, Periodicita p) {
	this.codiceISBN = cod;
	this.titolo = t;
	this.annoPubblicazione = d;
	this.Periodicita = p;
	this.numeroPagine = numeroPagine;

    }

}
