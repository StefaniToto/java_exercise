package al.alexiasolutions.eshop.eShopBackend.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import al.alexiasolutions.eshop.eShopBackend.dao.mapper.ProductMapper;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;

@Repository(value = "ProductDAOImpl")
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private ProductMapper mapper;
	
	
	@Override
	public List<ListProductDTO> listproduct(int n_idproduct) {
		Map<String,Object> map = new HashMap <String,Object> ();
		map.put("n_idproduct",n_idproduct);
		return mapper.listproduct(map);
		
	}

}
