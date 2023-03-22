package elementoMultimediale;

import java.util.Scanner;

public class Immagine {
    int luminosità;

    public Immagine() {
	System.out.println("Vuoi impostare la luminosità? Imposta un valore da 1 a 10: ");
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	this.luminosità = s;
	System.out.println("Luminosità: " + luminosità);
	aumentaLuminosità();
    }

    public void aumentaLuminosità() {
	System.out.println("Vuoi alzare la luminosità? Imposta un valore da 1 a 10: ");
	Scanner sc = new Scanner(System.in);
	int s1 = sc.nextInt();
	if (s1 == 0) {
	    System.out.println("Luminosiotà minima");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 1) {
	    System.out.println("*");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 2) {
	    System.out.println("*");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 3) {
	    System.out.println("***");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 4) {
	    System.out.println("****");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 5) {
	    System.out.println("*****");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 6) {
	    System.out.println("******");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 7) {
	    System.out.println("*******");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 8) {
	    System.out.println("********");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 9) {
	    System.out.println("*********");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else if (s1 == 10) {
	    System.out.println("**********");
	    System.out.println("Luminosità è al: " + s1 * 10 + "%");
	} else {
	    System.out.println("HAI RAGGIUNTO IL VOLUME MAX");
	}

	Scanner sc1 = new Scanner(System.in);
	System.out.println("Vuoi abbassare la luminosità? Imposta un valore da 1 a 10: ");
	int s = sc1.nextInt();
	if (s == 0) {
	    System.out.println("Hai disattivato luminosità");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 1 && s < s1) {
	    System.out.println("*");
	    System.out.println("iLuminosità è al: " + s * 10 + "%");
	} else if (s == 2 && s < s1) {
	    System.out.println("**");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 3 && s < s1) {
	    System.out.println("***");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 4 && s < s1) {
	    System.out.println("****");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 5 && s < s1) {
	    System.out.println("*****");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 6 && s < s1) {
	    System.out.println("******");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 7 && s < s1) {
	    System.out.println("*******");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 8 && s < s1) {
	    System.out.println("********");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 9 && s < s1) {
	    System.out.println("*********");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else if (s == 10 && s < s1) {
	    System.out.println("**********");
	    System.out.println("Luminosità è al: " + s * 10 + "%");
	} else {
	    System.out.println("STAI ALZANDO LA LUMINOSITA', DEVI ABBASSARLA!");
	}

    }
}
