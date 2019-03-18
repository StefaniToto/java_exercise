package it.itsvil.classwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.itsvil.classworkbackend.dto.RequestKeepAliveDTO;
import it.itsvil.classworkbackend.dto.ResponseKeepAliveDTO;
import it.itsvil.classworkbackend.dto.RisultatoDTO;
import it.itsvil.classworkbackend.dto.TableDTO;
import it.itsvil.classworkbackend.dto.TableRequestDTO;
import it.itsvil.classworkbackend.dto.TableResponseDTO;
import it.itsvil.classworkbackend.service.TableService;
import it.itsvil.classworkbackend.utility.ClassworkCostants;

@RestController
@RequestMapping(value = "/table")
public class TableRest {

	@Autowired
	private TableService service;
	
	@RequestMapping(value = "/getpizza", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<TableResponseDTO> getPizza(@RequestBody TableRequestDTO  request){
		
		RisultatoDTO result = new RisultatoDTO();
		
		TableResponseDTO response = new TableResponseDTO();
		
		List<TableDTO> lista = service.getPizza(request);
		
		response.setList(lista);		
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("List Pizza - POST");
		response.setRisultato(result);
		
		
		return new ResponseEntity<TableResponseDTO> (response,HttpStatus.OK);
		
		
	}
		
	@RequestMapping(value = "/getidprice", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<TableResponseDTO> selectcondition(@RequestBody TableRequestDTO  request , @RequestBody TableRequestDTO  request1  ){
		
		RisultatoDTO result = new RisultatoDTO();
		
		TableResponseDTO response = new TableResponseDTO();
		List<TableDTO> lista = service.selectcondition(request, request1);
		
		response.setList(lista);
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("List Pizza - POST");
		response.setRisultato(result);
	
		return new ResponseEntity<TableResponseDTO> (response,HttpStatus.OK);
		
	}
	
	
}
