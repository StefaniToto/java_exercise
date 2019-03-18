package al.alexiasolutions.eshop.eShopBackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;


@Repository
public interface ProductDAO {

	List<ListProductDTO> listproduct(int n_idproduct);
	
	String insertproduct(int n_idproduct, String t_name,String t_brand, double n_price, int n_quantity );
	

}
