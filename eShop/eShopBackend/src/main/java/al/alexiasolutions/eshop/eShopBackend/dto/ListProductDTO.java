package al.alexiasolutions.eshop.eShopBackend.dto;

import java.io.Serializable;

public class ListProductDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int n_idproduct ;
	private String t_name;
	private String t_brand;
	private double n_price;
	private int n_quantity;
	
	public ListProductDTO(int n_idproduct, String t_name, String t_brand, double n_price, int n_quantity) {
		super();
		this.n_idproduct = n_idproduct;
		this.t_name = t_name;
		this.t_brand = t_brand;
		this.n_price = n_price;
		this.n_quantity = n_quantity;
	}

	public ListProductDTO() {
		super();
	}

	public int getN_idproduct() {
		return n_idproduct;
	}

	public void setN_idproduct(int n_idproduct) {
		this.n_idproduct = n_idproduct;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
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
