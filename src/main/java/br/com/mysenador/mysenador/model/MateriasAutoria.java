package br.com.mysenador.mysenador.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name= "materiasautoria")
public class MateriasAutoria {
	
	@Id
	protected Integer id;
	@OneToMany
	protected List<Materia> materias = new ArrayList<Materia>();
	@Column
	protected Integer Numero_PLS;
	
	public Integer getNumero_PLS() {
		return Numero_PLS;
	}
	public void setNumero_PLS(Integer numero_PLS) {
		Numero_PLS = numero_PLS;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	public void add(Materia materia) {
		
		materias.add(materia);
	}
	
	public void clear() {
		materias.clear();
	}
	
	public void preenche(MateriasAutoria materias, Optional<MateriasAutoria>materiasop ) {
		materias.setId(materiasop.get().getId());
		materias.setMaterias(materiasop.get().getMaterias());
		materias.setNumero_PLS(materiasop.get().getNumero_PLS());
		
	}
	
	

}
