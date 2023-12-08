package com.Proy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Proy.dto.MedicoDTO;
import com.Proy.repository.IMedicosRepositorio;

@Service
public class MedicosService implements IMedicosService{
	
	@Autowired
	private IMedicosRepositorio medicosRepositorio;
	
	public MedicosService() {
		super();
	}
	
	

	public MedicosService(IMedicosRepositorio medicosRepositorio) {
		super();
		this.medicosRepositorio = medicosRepositorio;
	}



	@Override
	public List<MedicoDTO> obtenerTodosMedicos() {
		// TODO Auto-generated method stub
		return this.medicosRepositorio.findAll();
	}

}
