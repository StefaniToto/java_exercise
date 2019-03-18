package al.alexiasolutions.eshop.eShopBackend.dto;

import java.io.Serializable;

public class RisultatoDTO implements Serializable{

	private static final long serialVersionUID = -4071612962199298148L;
	private int codice;
	private String descrizione;

	public int getCodice(){
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
