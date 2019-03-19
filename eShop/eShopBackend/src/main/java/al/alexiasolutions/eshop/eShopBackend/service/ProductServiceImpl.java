package al.alexiasolutions.eshop.eShopBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import al.alexiasolutions.eshop.eShopBackend.dao.ProductDAO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO1;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO2;

@Service(value = "ProductServiceImpl")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;

	@Override
	public List<ListProductDTO> listproduct(ProductRequestDTO request) {
		
		return dao.listproduct(request.getT_nome());
		
	}
	
	  @Override public Integer insertproduct(ProductRequestDTO1 request) {
	  
	  return
	  dao.insertproduct(request.getN_idproduct(),request.getT_nome(),request.getT_brand(),
			  request.getN_price(), request.getN_quantity());
	  
	  
	  }

	@Override
	public Integer updateproduct(ProductRequestDTO2 request) {
		
		 return  dao.updateproduct(request.getT_nome(),request.getT_brand());
		
	}
	 
	
	

}
