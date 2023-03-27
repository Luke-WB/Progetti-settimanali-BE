package CATALOGO_BIBLIOTECARIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Archivio {
    static Logger logger = Logger.getLogger("com.api.jar");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

	// LIBRI

	Libri l1 = new Libri(55545, "Un uomo sulla luna", 2023, "Valentina D'urbano", "Fantasy");
	Libri l2 = new Libri(55588, "L'uomo mascherato", 2022, "Massimo", "Horror");
	Libri l3 = new Libri(55599, "Il volo del gabbiano", 2021, "MassimoTroisi", "Biografia");
	List<Libri> elencoLibri = new ArrayList<>();
	aggiungiLibri(l1, elencoLibri);
	aggiungiLibri(l2, elencoLibri);
	aggiungiLibri(l3, elencoLibri);
	logger.info("LIBRI AGGIUNTI: " + elencoLibri.toString());
	rimuoviiLibri(elencoLibri);
	ricercaCodLibri(elencoLibri);
	ricercaAnnoLibri(elencoLibri);
	ricercaAutoreLibri(elencoLibri);

	// RIVISTE

	Riviste r1 = new Riviste(99900, "Chi?", 2022, Periodicità.SETTIMANALE);
	Riviste r2 = new Riviste(99911, "AutoScout24", 2021, Periodicità.MENSILE);
	Riviste r3 = new Riviste(99922, "Sudoku6", 2023, Periodicità.SEMESTRALE);
	List<Riviste> elencoRiviste = new ArrayList<>();
	aggiungiRiviste(r1, elencoRiviste);
	aggiungiRiviste(r2, elencoRiviste);
	aggiungiRiviste(r3, elencoRiviste);
	logger.info("RIVISTE AGGIUNTE: " + elencoRiviste.toString());
	rimuoviiRiviste(elencoRiviste);
	ricercaCodRiviste(elencoRiviste);
	ricercaAnnoRiviste(elencoRiviste);

    }

    // LIBRI

    public static void aggiungiLibri(Libri l, List<Libri> lista) {

	lista.add(l);
	lista.stream().collect(Collectors.toList());

    }

    public static void rimuoviiLibri(List<Libri> lista) {
	System.out.println("inserisci codice libro per rimuoverlo");
	int codice = sc.nextInt();

	List<Libri> libriRimanenti = lista.stream().filter(x -> x.getCodiceISBN() != codice)
		.collect(Collectors.toList());
	logger.info("LIBRI RIMANENTI: " + libriRimanenti.toString());

    }

    public static void ricercaCodLibri(List<Libri> lista) {
	System.out.println("inserisci codice libro per cercarlo");
	int codice = sc.nextInt();
	List<Libri> libriRimanenti = lista.stream().filter(x -> x.getCodiceISBN() == codice)
		.collect(Collectors.toList());
	logger.info("ECCO IL TUO LIBRO TRAMITE CODICE: " + libriRimanenti.toString());

    }

    public static void ricercaAnnoLibri(List<Libri> lista) {
	System.out.println("inserisci anno di pubblicazione libro per cercarlo");
	int codice = sc.nextInt();
	List<Libri> libriRimanenti = lista.stream().filter(x -> x.getAnnoPubblicazione() == codice)
		.collect(Collectors.toList());
	logger.info("ECCO IL TUO LIBRO TRAMITE ANNO: " + libriRimanenti.toString());

    }

    public static void ricercaAutoreLibri(List<Libri> lista) {
	System.out.println("inserisci autore di un libro per cercarlo");
	String codice = sc.next();
	List<Libri> libriRimanenti = lista.stream().filter(x -> x.getAutore().equals(codice))
		.collect(Collectors.toList());
	logger.info("ECCO IL TUO LIBRO TRAMITE AUTORE: " + libriRimanenti.toString());

    }

    // RIVISTE

    public static void aggiungiRiviste(Riviste r, List<Riviste> lista) {
	lista.add(r);
	lista.stream().collect(Collectors.toList());
    }

    public static void rimuoviiRiviste(List<Riviste> lista) {
	System.out.println("inserisci codice rivista per rimuoverlo");
	int codice = sc.nextInt();
	List<Riviste> rivisteRimanenti = lista.stream().filter(x -> x.getCodiceISBN() != codice)
		.collect(Collectors.toList());
	logger.info("RIVISTE RIMANENTI: " + rivisteRimanenti.toString());
    }

    public static void ricercaCodRiviste(List<Riviste> lista) {
	System.out.println("inserisci codice rivista per cercarlo");
	int codice = sc.nextInt();
	List<Riviste> rivisteRimanenti = lista.stream().filter(x -> x.getCodiceISBN() == codice)
		.collect(Collectors.toList());
	logger.info("ECCO IL TUA RIVISTA TRAMITE CODICE: " + rivisteRimanenti.toString());
    }

    public static void ricercaAnnoRiviste(List<Riviste> lista) {
	System.out.println("inserisci anno rivista per cercarlo");
	int codice = sc.nextInt();
	List<Riviste> rivisteRimanenti = lista.stream().filter(x -> x.getAnnoPubblicazione() == codice)
		.collect(Collectors.toList());
	logger.info("ECCO IL TUA RIVISTA TRAMITE ANNO: " + rivisteRimanenti.toString());

    }

}
