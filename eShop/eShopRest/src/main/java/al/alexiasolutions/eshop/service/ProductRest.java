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
	
	private static final Logger log = Logger.getLogger(UtilityServiceRest.class.getName());
	
	@RequestMapping(value = "/postKeepAlive", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<ProductResponseDTO> postKeepAlive(@RequestBody ProductRequestDTO  request){
		
		RisultatoDTO result = new RisultatoDTO();
		ProductResponseDTO response = new ProductResponseDTO();
		List< ListProductDTO> lista =s ervice.listproduct(request);
		
		response.setLista( lista );
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("I am alive - POST");
		response.setRisultato(result);
		
		
		return new ResponseEntity<ProductResponseDTO>(response, HttpStatus.OK);	
		
		
	}
	
	
}
