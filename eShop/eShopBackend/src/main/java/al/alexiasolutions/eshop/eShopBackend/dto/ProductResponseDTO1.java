package al.alexiasolutions.eshop.eShopBackend.dto;

import java.io.Serializable;
import java.util.List;

public class ProductResponseDTO1 implements Serializable{
  

	private static final long serialVersionUID = -5523488092196644725L;
	private List<ListProductDTO> list;
	    private int status;
	    
	    
		
		  public ProductResponseDTO1() {
			super();
		}
	    
		public ProductResponseDTO1(List<ListProductDTO> list, int status) {
			super();
			this.list = list;
			this.status = status;
		}
		public List<ListProductDTO> getList() {
			return list;
		}
		public void setList(List<ListProductDTO> list) {
			this.list = list;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
}
