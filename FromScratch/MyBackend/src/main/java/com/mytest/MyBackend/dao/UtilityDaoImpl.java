package com.mytest.MyBackend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mytest.MyBackend.dao.mapper.UtilityMapper;
import com.mytest.MyBackend.dto.ConfGenDTO;


@Repository(value = "UtilityDaoImpl")
public class UtilityDaoImpl  implements UtilityDao{

	
	@Autowired
	private UtilityMapper mapper;
	
	public List<ConfGenDTO> getKeepAlive() {
		return mapper.getKeepAlive();
	}

}
