package al.alexiasolutions.eshop.eShopBackend.dto;

import java.io.Serializable;

public class IdListDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int n_idproduct ;
	
	public IdListDTO(int n_idproduct) {
		super();
		this.n_idproduct = n_idproduct;
	}

	public IdListDTO() {
		super();
	}

	public int getN_idproduct() {
		return n_idproduct;
	}

	public void setN_idproduct(int n_idproduct) {
		this.n_idproduct = n_idproduct;
	}
	
	
	
	
}
