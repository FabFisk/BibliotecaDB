package biblioteca;

import java.util.*;

public class Utente {
	
	private String nome, cognome;
	private List<Libro> prestiti;

	public Utente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		prestiti = new ArrayList<Libro>();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public List<Libro> getPrestiti() {
		return prestiti;
	}
	public void setPrestiti(List<Libro> prestiti) {
		this.prestiti = prestiti;
	}
}
