package it.itsvil.classworkbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import it.itsvil.classworkbackend.dto.TableDTO;


@Repository
public interface TableDAO {

	List<TableDTO> getPizza(int n_prezzo);

	List<TableDTO> selectcondition(int n_prezzo, int n_idpizza);


}
