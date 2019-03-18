package it.itsvil.classworkbackend.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import it.itsvil.classworkbackend.dto.TableDTO;
import it.itsvil.classworkbackend.dto.TableRequestDTO;

@Service
public interface TableService {

	List <TableDTO> getPizza(TableRequestDTO request );
	
	List<TableDTO> selectcondition (TableRequestDTO request, TableRequestDTO request1);
	
	
}
