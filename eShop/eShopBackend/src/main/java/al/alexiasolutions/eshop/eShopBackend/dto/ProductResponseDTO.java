package al.alexiasolutions.eshop.eShopBackend.dto;

import java.io.Serializable;
import java.util.List;



public class ProductResponseDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private List<ListProductDTO> lista;		
	private RisultatoDTO risultato;
	private String operatoreInserted;

	
	
	public String getOperatoreInserted() {
		return operatoreInserted;
	}
	public void setOperatoreInserted(String operatoreInserted) {
		this.operatoreInserted = operatoreInserted;
	}
	public ProductResponseDTO() {
		super();
	}
	public ProductResponseDTO(List<ListProductDTO> lista,
			RisultatoDTO risultato) {
		super();
		this.lista = lista;
		this.risultato = risultato;
	}
	public List<ListProductDTO> getLista() {
		return lista;
	}
	public void setLista(List<ListProductDTO> lista) {
		this.lista = lista;
	}
	public RisultatoDTO getRisultato() {
		return risultato;
	}
	public void setRisultato(RisultatoDTO risultato) {
		this.risultato = risultato;
	}
	
	
	

	
	

}
