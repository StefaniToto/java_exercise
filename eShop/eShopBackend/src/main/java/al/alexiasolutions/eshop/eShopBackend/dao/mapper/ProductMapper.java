package al.alexiasolutions.eshop.eShopBackend.dao.mapper;

import java.util.List;
import java.util.Map;

import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;


public interface ProductMapper {

	
	public  List<ListProductDTO> listproduct(Map<String,Object> map );
	
	 String insertproduct(Map<String, Object> map); 
}
