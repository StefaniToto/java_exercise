package al.alexiasolutions.eshop.eShopBackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;


@Repository
public interface ProductDAO {

	List<ListProductDTO> listproduct(int n_idproduct);
	
	
}
