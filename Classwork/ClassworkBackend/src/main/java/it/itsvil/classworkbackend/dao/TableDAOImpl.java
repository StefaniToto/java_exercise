package it.itsvil.classworkbackend.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.itsvil.classworkbackend.dao.mapper.TableMapper;
import it.itsvil.classworkbackend.dto.TableDTO;

@Repository(value = "TableDAOImpl")
public class TableDAOImpl implements TableDAO {

	@Autowired
	private TableMapper mapper;
	
	@Override
	public List<TableDTO> getPizza(int n_prezzo){
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("n_prezzo",n_prezzo);
				
		return mapper.getPizza(map);
		
		
	}

	@Override
	public List<TableDTO> selectcondition(int n_prezzo, int n_idpizza) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,Object> map1 = new HashMap<String,Object>();
		
		map.put("n_prezzo",n_prezzo);
		map1.put("n_idpizza",n_idpizza);
		
		return mapper.selectcondition(map, map1);
	}
	
}
