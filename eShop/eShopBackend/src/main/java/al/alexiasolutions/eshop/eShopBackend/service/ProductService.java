package al.alexiasolutions.eshop.eShopBackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO;



@Service
public interface ProductService {
	public  List<ListProductDTO> listproduct(ProductRequestDTO request );
}
