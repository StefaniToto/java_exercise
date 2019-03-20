package al.alexiasolutions.eshop.eShopBackend.dto;

public class ProductRequestDTO2 {

	private String t_nome ;
	private String t_brand ;
	private double n_price ;
	private int n_quantity ;
	public ProductRequestDTO2(String t_nome, String t_brand, double n_price, int n_quantity) {
		super();
		this.t_nome = t_nome;
		this.t_brand = t_brand;
		this.n_price = n_price;
		this.n_quantity = n_quantity;
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
	public double getN_price() {
		return n_price;
	}
	public void setN_price(double n_price) {
		this.n_price = n_price;
	}
	public int getN_quantity() {
		return n_quantity;
	}
	public void setN_quantity(int n_quantity) {
		this.n_quantity = n_quantity;
	}
	
	
	
	
}
