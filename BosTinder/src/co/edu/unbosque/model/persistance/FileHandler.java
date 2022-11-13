package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	private static File file;
    private static Scanner reader;
    private static PrintWriter writer;
    
    private String archivodata = "src/co/edu/unbosque/model/persistance/datos.csv";
    
	public int escribirArchivo(String dato) {
		
		File f = new File(this.archivodata);
			
			try {
				
			FileWriter fw = new FileWriter(archivodata,true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();
			
		} catch (IOException e) {
			
			return -1;
		}
		return 0;
	}
    
}
