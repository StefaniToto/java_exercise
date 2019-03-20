package al.alexiasolutions.eshop.eShopBackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import al.alexiasolutions.eshop.eShopBackend.dto.IdListDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;


@Repository
public interface ProductDAO {

	List<ListProductDTO> listproduct(String t_nome);
	
	
	  Integer insertproduct(int n_idproduct, String t_nome,String t_brand, double
	  n_price, int n_quantity );


	Integer updateproduct(String t_nome, String t_brand);
	
	List<IdListDTO> selectupdate( String t_nome,String t_brand);
	 
	

}
