package it.itsvil.classworkbackend.dto;

import java.io.Serializable;

public class TableDTO implements Serializable{


	private static final long serialVersionUID = -1877317626205075562L;
	private int n_idpizza;
	private String t_nome;
	private int n_prezzo;
	
	public TableDTO() {
		super();
	}

	public TableDTO(int n_idpizza, String t_nome, int n_prezzo) {
		super();
		this.n_idpizza = n_idpizza;
		this.t_nome = t_nome;
		this.n_prezzo = n_prezzo;
	}

	public int getN_idpizza() {
		return n_idpizza;
	}

	public void setN_idpizza(int n_idpizza) {
		this.n_idpizza = n_idpizza;
	}

	public String getT_nome() {
		return t_nome;
	}

	public void setT_nome(String t_nome) {
		this.t_nome = t_nome;
	}

	public int getN_prezzo() {
		return n_prezzo;
	}

	public void setN_prezzo(int n_prezzo) {
		this.n_prezzo = n_prezzo;
	}
	

	
}
