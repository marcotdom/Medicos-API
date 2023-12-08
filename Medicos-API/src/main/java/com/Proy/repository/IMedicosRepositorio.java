package com.Proy.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.Proy.dto.MedicoDTO;

public interface IMedicosRepositorio extends JpaRepository<MedicoDTO, Long>{
	
	 @Query("FROM MedicoDTO")
     public List<MedicoDTO> findAll();

}
