package al.alexiasolutions.eshop.eShopBackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import al.alexiasolutions.eshop.eShopBackend.dto.ConfGenDTO;



@Repository
public interface UtilityDao{
	
	List<ConfGenDTO> getKeepAlive();

}
