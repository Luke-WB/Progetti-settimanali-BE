package CATALOGO_BIBLIOTECARIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.commons.io.FileUtils;

public class Disco {

    public static void writeFile(Archivio archivio) throws IOException {
	File myCatalogue = new File("archivio.txt");
	FileWriter myPW = new FileWriter(myCatalogue);
	
	myPW.close();
    }

    public static void readFile(Archivio archivio) throws IOException {
	File file1 = new File("archivio.txt");
	String readString = FileUtils.readFileToString(file1, "UTF-8");
	System.out.println(readString);
    }

}
