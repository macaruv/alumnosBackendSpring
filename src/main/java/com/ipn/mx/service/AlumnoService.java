package com.ipn.mx.service;

import java.util.List;

import com.ipn.mx.domain.entity.Alumno;

public interface AlumnoService {
	Alumno save(Alumno alumno);
	void deleteById(Long id);
	List<Alumno> findAll();
	Alumno findById(Long id);
	Alumno update(Long id, Alumno alumno);
}
