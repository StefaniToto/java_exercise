package it.itsvil.classworkbackend.dto;

import java.io.Serializable;

public class TableRequestDTO implements Serializable{

	private static final long serialVersionUID = 6523087579278493352L;
	private int n_prezzo;
	private int n_idpizza;
	
	
	public TableRequestDTO(int n_prezzo) {
		super();
		this.n_prezzo = n_prezzo;
	}

	public TableRequestDTO() {
		super();
	}

	public int getN_prezzo() {
		return n_prezzo;
	}

	public void setN_prezzo(int n_prezzo) {
		this.n_prezzo = n_prezzo;
	}

	public int getN_idpizza() {
		return n_idpizza;
	}

	public void setN_idpizza(int n_idpizza) {
		this.n_idpizza = n_idpizza;
	}
	
	
}
