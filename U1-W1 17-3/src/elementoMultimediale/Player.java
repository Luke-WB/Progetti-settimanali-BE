package elementoMultimediale;

public class Player {
    static void show() {
	Immagine i = new Immagine();
    };

    static void play() {
	Video v = new Video();
	Audio a = new Audio();
    }

    public static void main(String[] args) {
	Immagine i1 = new Immagine();
	Immagine i2 = new Immagine();
	Video v1 = new Video();
	Audio a1 = new Audio();
	Audio a2 = new Audio();

	/* public Multimedia [] m = {i1, i2, v1, a1, a2} */

	System.out.println("-- INSERISCI AUDIO E VIDEO --");
	play();
	System.out.println("-- INSERISCI IMMAGINE --");
	show();
    }

}
