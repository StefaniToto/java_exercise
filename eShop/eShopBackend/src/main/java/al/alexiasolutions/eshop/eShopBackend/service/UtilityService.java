package al.alexiasolutions.eshop.eShopBackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import al.alexiasolutions.eshop.eShopBackend.dto.ConfGenDTO;


@Service
public interface UtilityService {
	
	public  List<ConfGenDTO> keepAlive();

}
