package elementoMultimediale;

import java.util.Scanner;

public class Audio {

    private int volume = 0;

    public Audio() {
	titolo();
	alzaVolume();
    };

    public void titolo() {
	System.out.println("Inserisci un titolo: ");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println("Hai inserito il titolo: " + s);
    }

    public void alzaVolume() {
	System.out.println("Il volume è 0%; Vuoi alzare il volume? imposta un valore da 1 a 10: ");
	Scanner sc = new Scanner(System.in);
	int s1 = sc.nextInt();
	if (s1 == 0) {
	    System.out.println("Hai disattivato l'audio");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 1) {
	    System.out.println("!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 2) {
	    System.out.println("!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 3) {
	    System.out.println("!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 4) {
	    System.out.println("!!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 5) {
	    System.out.println("!!!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 6) {
	    System.out.println("!!!!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 7) {
	    System.out.println("!!!!!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 8) {
	    System.out.println("!!!!!!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 9) {
	    System.out.println("!!!!!!!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else if (s1 == 10) {
	    System.out.println("!!!!!!!!!!");
	    System.out.println("il volume è al: " + s1 * 10 + "%");
	} else {
	    System.out.println("HAI RAGGIUNTO IL VOLUME MAX");
	}

	System.out.println("Vuoi abbassare il volume? imposta un valore da 1 a 10: ");
	Scanner sc1 = new Scanner(System.in);
	int s = sc1.nextInt();
	if (s == 0) {
	    System.out.println("Hai disattivato l'audio");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 1 && s < s1) {
	    System.out.println("!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 2 && s < s1) {
	    System.out.println("!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 3 && s < s1) {
	    System.out.println("!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 4 && s < s1) {
	    System.out.println("!!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 5 && s < s1) {
	    System.out.println("!!!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 6 && s < s1) {
	    System.out.println("!!!!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 7 && s < s1) {
	    System.out.println("!!!!!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 8 && s < s1) {
	    System.out.println("!!!!!!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 9 && s < s1) {
	    System.out.println("!!!!!!!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else if (s == 10 && s < s1) {
	    System.out.println("!!!!!!!!!!");
	    System.out.println("il volume è al: " + s * 10 + "%");
	} else {
	    System.out.println("STAI ALZANDO IL VOLUME, DEVI ABBASSARLO!");
	}

    }

}
