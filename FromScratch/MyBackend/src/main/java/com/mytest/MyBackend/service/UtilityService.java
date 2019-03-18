package com.mytest.MyBackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mytest.MyBackend.dto.ConfGenDTO;

@Service
public interface UtilityService {
	
	public  List<ConfGenDTO> keepAlive();

}
