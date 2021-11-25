package it.shop;

import java.util.Random;

public class Prodotto {

	// Attributi
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private double iva;

	// Costruttore#1
	public Prodotto() {
		this.codice = generatoreDiCodici();

	}

	// CostruttoreDebug
	public Prodotto(int codice, String nome, String descrizione, int prezzo, double iva) {
		this.codice = generatoreDiCodici();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// Getter and Setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (isNullorEmptyString(nome)) {
			System.out.println("Il campo \"nome\" non può essere vuoto.");
		} else {
			this.nome = nome;
		}

	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		if (isNullorEmptyString(descrizione)) {
			System.out.println("Il campo \"descrizione\"non può essere vuoto.");
		} else {
			this.descrizione = descrizione;
		}

	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		if (prezzoValido(prezzo)) {
			this.prezzo = prezzo;
		} else {
			System.out.println("La voce \"Prezzo\" deve essere maggiore di \"Zero\".");
		}

	}

	public int getCodice() {
		return codice;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(int iva) {
		if (prezzoValido(iva)) {
			this.iva = iva;
		} else {
			System.out.println("La voce \"Iva\" deve essere maggiore di \"Zero\".");
		}

	}

	// Metodo che genera e ritorna un codice casuale
	private int generatoreDiCodici() {
		Random random = new Random();
		return random.nextInt(500);
	}

	// Metodo che verifica se una stringa è nulla o vuota
	private boolean isNullorEmptyString(String string) {
		return string == null || string.length() == 0;
	}

	// Metodo per stampare il prezzo con iva
	public double stampaPrezzoConIva() {
		double stampaPrezzoConIva = prezzo + prezzo * iva;
		return stampaPrezzoConIva;
	}

	// Metodo per avere codice + nome
	public String nomeEsteso() {
		String nomeEsteso = nome + " " + codice;
		return nomeEsteso;
	}

	// Metodo che verifica se il prezzo è valido
	private boolean prezzoValido(int prezzo) {
		return prezzo != 0.0D && prezzo > 0;
	}
}
