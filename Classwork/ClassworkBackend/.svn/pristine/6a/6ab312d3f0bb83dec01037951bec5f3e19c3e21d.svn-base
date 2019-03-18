package it.itsvil.classworkbackend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.itsvil.classworkbackend.dao.mapper.UtilityMapper;
import it.itsvil.classworkbackend.dto.ConfGenDTO;


@Repository(value = "UtilityDaoImpl")
public class UtilityDaoImpl  implements UtilityDao{

	
	@Autowired
	private UtilityMapper mapper;
	
	public List<ConfGenDTO> getKeepAlive() {
		return mapper.getKeepAlive();
	}

}
