package al.alexiasolutions.eshop.eShopBackend.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO1;

@Service
public interface ProductService {
	public List<ListProductDTO> listproduct(ProductRequestDTO request);

	Integer insertproduct(ProductRequestDTO1 reuqest); 



}
