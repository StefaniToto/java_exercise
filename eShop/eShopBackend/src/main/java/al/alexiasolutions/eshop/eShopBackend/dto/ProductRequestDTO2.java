package al.alexiasolutions.eshop.eShopBackend.dto;

public class ProductRequestDTO2 {

	private String t_nome ;
	private String t_brand ;
	
	public ProductRequestDTO2(String t_nome, String t_brand) {
		super();
		this.t_nome = t_nome;
		this.t_brand = t_brand;
	}

	public ProductRequestDTO2() {
		super();
	}

	public String getT_nome() {
		return t_nome;
	}

	public void setT_nome(String t_nome) {
		this.t_nome = t_nome;
	}

	public String getT_brand() {
		return t_brand;
	}

	public void setT_brand(String t_brand) {
		this.t_brand = t_brand;
	}
	
	
}
