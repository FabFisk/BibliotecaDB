package db;

import java.util.*;

import biblioteca.*;

public class DatabaseVirtuale {
	
	Map<String, Biblioteca> reteBiblioteche = new TreeMap<String, Biblioteca>();	
	
	public DatabaseVirtuale() {
		
		Biblioteca b = new Biblioteca("Biblioteca-01");
		
		reteBiblioteche.put(b.getNome(), b);
		
		Libro l1= new Libro("1984", "Orwell", "B001", 1);
		Libro l2= new Libro("Promessi", "Manzoni", "B002", 4);
		Libro l3= new Libro("Divina Commedia", "Dante", "B003", 1);
		Libro l4= new Libro("Sepolcri", "Foscolo", "B004", 10);
		Libro l5= new Libro("Signore degli Anelli", "Tolkien", "B005", 1);
		Libro l6= new Libro("Odissea", "Omero", "B006", 1);
		
		b.getLibri().add(l1);
		b.getLibri().add(l2);
		b.getLibri().add(l3);
		b.getLibri().add(l4);
		b.getLibri().add(l5);
		b.getLibri().add(l6);
				
		Utente u1 = new Utente("Mario", "Rossi");	
		Utente u2 = new Utente("Chiara", "Verdi");
		Utente u3 = new Utente("Luca", "Bianchi");
		
		b.getUtenti().add(u1);
		b.getUtenti().add(u2);
		b.getUtenti().add(u3);
		
		
	}
	
	

}
