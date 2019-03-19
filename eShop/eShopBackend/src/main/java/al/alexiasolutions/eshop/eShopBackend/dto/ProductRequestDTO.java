package al.alexiasolutions.eshop.eShopBackend.dto;

import java.io.Serializable;

public class ProductRequestDTO implements Serializable {


	private static final long serialVersionUID = 1L;

	private String t_nome;

	public ProductRequestDTO(String t_nome) {
		super();
		this.t_nome = t_nome;
	}

	public ProductRequestDTO() {
		super();
	}

	public String getT_nome() {
		return t_nome;
	}

	public void setT_nome(String t_nome) {
		this.t_nome = t_nome;
	}

	
	



}
