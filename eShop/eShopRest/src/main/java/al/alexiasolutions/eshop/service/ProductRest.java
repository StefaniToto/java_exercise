package al.alexiasolutions.eshop.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import al.alexiasolutions.eshop.eShopBackend.dto.ProductResponseDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.RequestKeepAliveDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ResponseKeepAliveDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.RisultatoDTO;
import al.alexiasolutions.eshop.eShopBackend.service.ProductService;
import al.alexiasolutions.eshop.eShopBackend.utility.ClassworkCostants;



@RestController
@RequestMapping(value = "/test")
public class ProductRest {

	@Autowired
	private ProductService service;
	
	
	
	@RequestMapping(value = "/getproduct", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<ProductResponseDTO> listproduct(@RequestBody ProductRequestDTO  request){
		
		RisultatoDTO result = new RisultatoDTO();
		
		ProductResponseDTO response = new ProductResponseDTO();
		
		List<ListProductDTO> lista = service.listproduct(request);
		
		response.setLista(lista);		
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("List Pizza - POST");
		response.setRisultato(result);
		
		return new ResponseEntity<ProductResponseDTO>(response, HttpStatus.OK);	
			}
	@RequestMapping(value = "/insertproduct", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<ProductResponseDTO > insertproduct(@RequestBody ProductRequestDTO  request){
		
		RisultatoDTO result = new RisultatoDTO();
		
		ProductResponseDTO response = new ProductResponseDTO();;
		
		String answer=service.insertproduct(request);
		response.setOperatoreInserted(answer);
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("List Pizza - POST");
		response.setRisultato(result);
		
	
		
		
		return new ResponseEntity<ProductResponseDTO>(response, HttpStatus.OK);	
		
		
	}
	
	
	
	
	
	
}
