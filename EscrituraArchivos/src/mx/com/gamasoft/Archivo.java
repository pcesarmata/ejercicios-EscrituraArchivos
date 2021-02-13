/**
 * 
 */
package mx.com.gamasoft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

/**
 * @author Cesar
 *
 */
public class Archivo {
	
	public static void main(String[] args) {
		File archivo = new File("C://test//archivo.txt");
		Path ruta = Paths.get("C://test");
		final Formatter nuevoArchivo;
		String contenido = "Hola Mundo!";
		
		if(Files.exists(ruta)) {
			System.out.println("El directorio existe");
			if (archivo.exists()) {
				System.out.println("El archivo existe");
				if (archivo.canWrite()) {
					System.out.println("El archivo existe y puedo escribir");
				} else {
					System.out.println("El archivo existe pero no tiene permisos de escritura");
				}
			} else {
				try {
					Files.createDirectories(ruta);
					System.out.println("El directorio ha sido creado");
					try {
						nuevoArchivo = new Formatter("C://test//archivo.txt");
						System.out.println("El archivo ha sido creado");
						nuevoArchivo.format(contenido);
						System.out.println("Se ha agregado contenido al archivo");
						nuevoArchivo.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} else {
			try {
				Files.createDirectories(ruta);
				System.out.println("El directorio ha sido creado");
				try {
					nuevoArchivo = new Formatter("C://test//archivo.txt");
					System.out.println("El archivo ha sido creado");
					nuevoArchivo.format(contenido);
					System.out.println("Se ha agregado contenido al archivo");
					nuevoArchivo.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
}