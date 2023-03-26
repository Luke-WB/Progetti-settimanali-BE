package CATALOGO_BIBLIOTECARIO;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Libri {

    private @Getter int codiceISBN;
    private String titolo;
    private @Getter int annoPubblicazione;
    private int numeroPagine = 100;
    private @Getter String autore;
    private String genere;

    public Libri(int cod, String t, int d, String aut, String gen) {
	this.codiceISBN = cod;
	this.titolo = t;
	this.annoPubblicazione = d;
	this.autore = aut;
	this.genere = gen;
	this.numeroPagine = numeroPagine;

    }

}
