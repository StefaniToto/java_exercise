package al.alexiasolutions.eshop.eShopBackend.dto;

import java.io.Serializable;
import java.util.List;

public class ProductResponseDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	
	public List<ListProductDTO> lista;	
	
	public ListProductDTO risultato;
	
	public ProductResponseDTO(List<ListProductDTO> lista, ListProductDTO risultato) {
		super();
		this.lista = lista;
		this.risultato = risultato;
	}

	public ProductResponseDTO() {
		super();
	}

	public List<ListProductDTO> getLista() {
		return lista;
	}

	public void setLista(List<ListProductDTO> lista) {
		this.lista = lista;
	}

	public ListProductDTO getRisultato() {
		return risultato;
	}

	public void setRisultato(ListProductDTO risultato) {
		this.risultato = risultato;
	}
	

}
