package it.itsvil.classworkbackend.dto;

import java.io.Serializable;
import java.util.List;

public class TableResponseDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<TableDTO> list;
	private List<TableDTO> list1;
	private RisultatoDTO risultato;
	
	public TableResponseDTO(List<TableDTO> list, List<TableDTO> list1) {
		super();
		this.list = list;
		this.list1 = list1;
	}
	
	
	
	public TableResponseDTO(List<TableDTO> list, RisultatoDTO risultato) {
		super();
		this.list = list;
		this.risultato = risultato;
	}
	public TableResponseDTO() {
		super();
	}
	public List<TableDTO> getList() {
		return list;
	}
	public void setList(List<TableDTO> list) {
		this.list = list;
	}
	public RisultatoDTO getRisultato() {
		return risultato;
	}
	public void setRisultato(RisultatoDTO risultato) {
		this.risultato = risultato;
	}
	
	
}
