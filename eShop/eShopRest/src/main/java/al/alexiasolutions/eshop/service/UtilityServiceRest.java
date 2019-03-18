package al.alexiasolutions.eshop.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import al.alexiasolutions.eshop.eShopBackend.dto.RequestKeepAliveDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ResponseKeepAliveDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.RisultatoDTO;
import al.alexiasolutions.eshop.eShopBackend.service.UtilityService;
import al.alexiasolutions.eshop.eShopBackend.utility.ClassworkCostants;





@RestController
@RequestMapping(value = "/test")
public class UtilityServiceRest {
	
	@Autowired
	private UtilityService utilityService;

	private static final Logger log = Logger.getLogger(UtilityServiceRest.class.getName());
	
	@RequestMapping(value = "/postKeepAlive", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<ResponseKeepAliveDTO> postKeepAlive(@RequestBody RequestKeepAliveDTO  request){
		
		log.info("*** postKeepAlive - START ***");
		RisultatoDTO result = new RisultatoDTO();
		ResponseKeepAliveDTO response=new ResponseKeepAliveDTO();
		HttpStatus status = null;
		
		response.setLista(utilityService.keepAlive());
		status = HttpStatus.OK;
		result.setCodice(ClassworkCostants.ESITO_OK);
		result.setDescrizione("I am alive - POST");
		response.setRisultato(result);
		
		log.info("*** postKeepAlive - END ***");
		return new ResponseEntity<ResponseKeepAliveDTO>(response, status);	
	}
}
	