package al.alexiasolutions.eshop.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import al.alexiasolutions.eshop.eShopBackend.dto.ProductResponseDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductResponseDTO1;
import al.alexiasolutions.eshop.eShopBackend.dto.IdListDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListResponseDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO1;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO2;
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

	@RequestMapping(value = "/insertproduct", method = RequestMethod.POST,
			consumes = {"application/json"}, produces = {"application/json"}) public
	ResponseEntity<ProductResponseDTO1 > insertproduct(@RequestBody ProductRequestDTO1 request){

		RisultatoDTO result = new RisultatoDTO();

		ProductResponseDTO1 response = new ProductResponseDTO1();

		Integer answer = service.insertproduct(request);
		response.setStatus(answer);
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("List Pizza - POST");
		return new ResponseEntity<ProductResponseDTO1>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/selectupdate", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<ListResponseDTO> selectupdate(@RequestBody ProductRequestDTO1  request){

		RisultatoDTO result = new RisultatoDTO();

		ListResponseDTO response = new ListResponseDTO();

		List<IdListDTO> lista = service.selectupdate(request);

		response.setLista(lista);		
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("List ID equale - POST");
		response.setRisultato(result);

		return new ResponseEntity<ListResponseDTO>(response, HttpStatus.OK);	
	}
	
	
	
	
	@RequestMapping(value = "/updateproduct", method = RequestMethod.POST,
			consumes = {"application/json"}, produces = {"application/json"}) public
	ResponseEntity<ProductResponseDTO1 > updateproduct(@RequestBody ProductRequestDTO2 request){

		RisultatoDTO result = new RisultatoDTO();

		ProductResponseDTO1 response = new ProductResponseDTO1();

		Integer answer = service.updateproduct(request);
		response.setStatus(answer);
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("List Pizza - POST");



		return new ResponseEntity<ProductResponseDTO1>(response, HttpStatus.OK);


	}
	
	






}
