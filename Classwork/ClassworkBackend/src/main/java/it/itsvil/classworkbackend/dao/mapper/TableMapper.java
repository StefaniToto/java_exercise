package it.itsvil.classworkbackend.dao.mapper;

import java.util.List;
import java.util.Map;

import it.itsvil.classworkbackend.dto.TableDTO;

public interface TableMapper {

	List <TableDTO> getPizza(Map <String,Object> map );
	
	List<TableDTO> selectcondition (Map <String,Object> map, Map <String,Object> map1);
	
	
}
