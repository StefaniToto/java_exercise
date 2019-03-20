package al.alexiasolutions.eshop.eShopBackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import al.alexiasolutions.eshop.eShopBackend.dto.IdListDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO1;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO2;

@Service
public interface ProductService {
	public List<ListProductDTO> listproduct(ProductRequestDTO request);

	Integer insertproduct(ProductRequestDTO1 reuqest); 

	Integer updateproduct(ProductRequestDTO2 request);
	
	public List<IdListDTO> selectupdate(ProductRequestDTO1 request);

}
