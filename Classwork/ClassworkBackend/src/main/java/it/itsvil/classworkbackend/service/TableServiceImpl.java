package it.itsvil.classworkbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.itsvil.classworkbackend.dao.TableDAO;
import it.itsvil.classworkbackend.dto.TableDTO;
import it.itsvil.classworkbackend.dto.TableRequestDTO;

@Service(value="TableServiceImpl")
public class TableServiceImpl implements TableService {

	@Autowired
	private TableDAO dao;
	
	
	@Override
	public List<TableDTO> getPizza(TableRequestDTO request) {
		
		return dao.getPizza(request.getN_prezzo()) ;
	}


	@Override
	public List<TableDTO> selectcondition(TableRequestDTO request, TableRequestDTO request1) {
		
		return dao.selectcondition(request.getN_prezzo(),request1.getN_idpizza());
	}

}
