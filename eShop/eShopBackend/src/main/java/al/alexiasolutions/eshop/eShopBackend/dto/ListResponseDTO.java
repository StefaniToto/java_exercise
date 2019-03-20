package al.alexiasolutions.eshop.eShopBackend.dto;

import java.util.List;

public class ListResponseDTO {

	private List<IdListDTO> lista;		
	private RisultatoDTO risultato;
	private String operatoreInserted;
	private int status;
	
	public ListResponseDTO(List<IdListDTO> lista, RisultatoDTO risultato, String operatoreInserted) {
		super();
		this.lista = lista;
		this.risultato = risultato;
		this.operatoreInserted = operatoreInserted;
	}

	public ListResponseDTO() {
		super();
	}

	public List<IdListDTO> getLista() {
		return lista;
	}

	public void setLista(List<IdListDTO> lista) {
		this.lista = lista;
	}

	public RisultatoDTO getRisultato() {
		return risultato;
	}

	public void setRisultato(RisultatoDTO risultato) {
		this.risultato = risultato;
	}

	public String getOperatoreInserted() {
		return operatoreInserted;
	}

	public void setOperatoreInserted(String operatoreInserted) {
		this.operatoreInserted = operatoreInserted;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	
	
}
