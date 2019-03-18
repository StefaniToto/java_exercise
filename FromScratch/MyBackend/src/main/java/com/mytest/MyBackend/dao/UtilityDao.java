package com.mytest.MyBackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mytest.MyBackend.dto.ConfGenDTO;

@Repository
public interface UtilityDao{
	
	List<ConfGenDTO> getKeepAlive();

}
