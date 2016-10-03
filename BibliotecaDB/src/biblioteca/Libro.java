package biblioteca;

public class Libro {
	
	private String titolo, autore, serialNum;
	int copieTotali=0;
	int copieDisp=0;
	
	public Libro(String nome, String autore, String serialNum, int cpt) {
		this.titolo = nome;
		this.autore = autore;
		this.serialNum = serialNum;
		this.copieTotali = cpt;
		this.copieDisp = cpt;
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String nome) {
		this.titolo = nome;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public int getCopieTotali() {
		return copieTotali;
	}
	public void setCopieTotali(int copieTotali) {
		this.copieTotali = copieTotali;
	}
	public int getCopieDisp() {
		return copieDisp;
	}
	public void setCopieDisp(int copieDisp) {
		this.copieDisp = copieDisp;
	}
}
