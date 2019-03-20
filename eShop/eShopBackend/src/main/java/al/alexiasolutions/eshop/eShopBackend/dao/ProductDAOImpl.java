package al.alexiasolutions.eshop.eShopBackend.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import al.alexiasolutions.eshop.eShopBackend.dao.mapper.ProductMapper;
import al.alexiasolutions.eshop.eShopBackend.dto.IdListDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;

@Repository(value = "ProductDAOImpl")
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private ProductMapper mapper;
	
	
	@Override
	public List<ListProductDTO> listproduct(String  t_nome) {
		Map<String,Object> map = new HashMap <String,Object> ();
		map.put("t_nome",t_nome);
		return mapper.listproduct(map);
		
		
		
	}

	
	  @Override 
	  public Integer insertproduct(int n_idproduct, String t_nome, String t_brand, double n_price,
	  int n_quantity) { 
		  
		  Map <String ,Object> map=new HashMap<String ,Object>();
		  map.put("n_idproduct",n_idproduct); 
		  map.put("t_nome",t_nome); 
		  map.put("t_brand",t_brand); 
		  map.put("n_price",n_price);
	      map.put("n_quantity",n_quantity);
	  
	  
	      return mapper.insertproduct(map); }


	@Override
	public Integer updateproduct(String t_nome, String t_brand) {
		
		 
		  Map <String ,Object> map=new HashMap<String ,Object>();
		  map.put("t_nome",t_nome); 
		  map.put("t_brand",t_brand); 
		  return mapper.updateproduct(map);
	}


	@Override
	public List<IdListDTO> selectupdate(String t_nome, String t_brand) {
		Map<String,Object> map = new HashMap <String,Object> ();
		 map.put("t_nome",t_nome); 
		 map.put("t_brand",t_brand);
		 
		  return mapper.selectupdate(map);  
	}
	 
}
