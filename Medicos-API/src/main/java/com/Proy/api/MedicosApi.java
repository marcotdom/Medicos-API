package com.Proy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Proy.dto.MedicoDTO;
import com.Proy.service.MedicosService;

@RestController
public class MedicosApi {
	
	@Autowired
	private MedicosService service;
	
	//EndPoint para consultar el listado del total de medicos
	@RequestMapping(value="/medicos", method=RequestMethod.GET)
	public List<MedicoDTO> getAll() {
		return service.obtenerTodosMedicos();
	}
	

	

}
