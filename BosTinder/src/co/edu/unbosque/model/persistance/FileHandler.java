package co.edu.unbosque.model.persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.edu.unbosque.model.HombreDTO;

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
	
//	public String leerArchivo(ArrayList<HombreDTO> listaHombre) {
//		String linea = "";
//		String cadena = "";
//		
//		File f = new File(this.archivodata);
//		
//		try {
//			
//			FileReader fr = new  FileReader(f);
//			BufferedReader br = new BufferedReader(fr);
//			linea = br.readLine();
//			while(linea!=null) {
//				cadena += linea;
//		        String[] lines = linea.split(";");
//		        for (String s : lines) {
//		            if (s.equals(""))
//		                continue;
//		            String[] columns = s.split(";");
//		            listaHombre.add(new HombreDTO(columns[0],columns[1],columns[2],columns[3],columns[4],columns[5],columns[6],columns[7],columns[8],
//		            		columns[9],columns[10],columns[11],columns[12],columns[13],columns[14],
//		            		columns[15]));
//			        
//				}
//				linea = br.readLine();
//			}
//			
//			fr.close();
//			
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
//		
//		return cadena;
//	}
    
}
