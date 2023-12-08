package com.Proy.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medico")
public class MedicoDTO {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="especialidad")
	private String especialidad;
	 
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public MedicoDTO(int id, String nombre, String apellido, String especialidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.apellido = apellido;
	}
	public MedicoDTO() {
		super();
	}
}
