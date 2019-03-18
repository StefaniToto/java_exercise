package al.alexiasolutions.eshop.eShopBackend.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import al.alexiasolutions.eshop.eShopBackend.dao.UtilityDao;
import al.alexiasolutions.eshop.eShopBackend.dto.ConfGenDTO;


@Service(value = "UtilityServiceImpl")
public class UtilityServiceImpl implements UtilityService {
	
	private static final Logger log = Logger.getLogger(UtilityServiceImpl.class.getName());
	
	@Autowired
	private UtilityDao dao;

	public  List<ConfGenDTO> keepAlive() {
		
	    List<ConfGenDTO> lista = dao.getKeepAlive();
		
		return lista;
	}

}
