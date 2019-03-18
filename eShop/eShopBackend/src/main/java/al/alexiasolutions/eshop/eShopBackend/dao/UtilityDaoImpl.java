package al.alexiasolutions.eshop.eShopBackend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import al.alexiasolutions.eshop.eShopBackend.dao.mapper.UtilityMapper;
import al.alexiasolutions.eshop.eShopBackend.dto.ConfGenDTO;




@Repository(value = "UtilityDaoImpl")
public class UtilityDaoImpl  implements UtilityDao{

	
	@Autowired
	private UtilityMapper mapper;
	
	public List<ConfGenDTO> getKeepAlive() {
		return mapper.getKeepAlive();
	}

}
