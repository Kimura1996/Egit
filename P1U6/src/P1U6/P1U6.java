package P1U6;
import java.io.*;

public class P1U6 {
	
	public static void main(String[] args) throws IOException {
		//Comentario Githuub
	FileWriter fw = null;
	String nombrefichero="C:\\Users\\maran\\Documents\\archivos\\Programacion\\pruebaficheros.txt";
	
	try {
		
		fw = new FileWriter(nombrefichero,true);
		String linea="Esto es una prueba de escritura";
		
		for(int i=0; i<linea.length();i++) {
			
			fw.write(linea.charAt(i));
			
		}
		
		fw.close();
		
	}catch (IOException i) {
        i.printStackTrace();
	}
	

	String fichero =nombrefichero;
	int voca=0, voce=0, voci=0, voco=0, vocu=0;
	char car=' ';
	
	FileReader fr=null;
	
	try {
		
		fr =new FileReader(fichero);
		int caract= fr.read();
		while (caract != -1) {
			System.out.println((char)caract);
			caract=fr.read();
			
		}
		
		for(int i=0; i <fichero.length(); i++) {
			
			car=fichero.charAt(i);
			
			if(car =='a' ) {
				voca++;
			}
			if(car =='e' ) {
				voce++;
			}
			if(car =='i' ) {
				voci++;
			}
			if(car =='o' ) {
				voco++;
			}
			if(car =='u' ) {
				vocu++;
			}
		}
		System.out.println("El nº de veces que está la vocal 'a' es "+voca);
		System.out.println("El nº de veces que está la vocal 'e' es "+voce);
		System.out.println("El nº de veces que está la vocal 'i' es "+voci);
		System.out.println("El nº de veces que está la vocal 'o' es "+voco);
		System.out.println("El nº de veces que está la vocal 'u' es "+vocu);
		
		fr.close();
	}
	catch(FileNotFoundException e){
		System.out.println("Error: Fichero no encontrado");
        System.out.println(e.getMessage());
	}
	
	
	}
}
