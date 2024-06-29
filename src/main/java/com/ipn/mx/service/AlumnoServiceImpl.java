package com.ipn.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.domain.entity.Alumno;
import com.ipn.mx.domian.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	AlumnoRepository repository;
	
	@Transactional
	public Alumno save(Alumno alumno) {
		return repository.save(alumno);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		return (List<Alumno>) repository.findAll();
	}

	@Override
	public Alumno findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Alumno update(Long id, Alumno alumno) {
		Alumno existingAlumno = repository.findById(id).orElse(null);
		if(existingAlumno != null) {
			existingAlumno.setNombre(alumno.getNombre());
			existingAlumno.setApellidoMaterno(alumno.getApellidoMaterno());
			existingAlumno.setApellidoPaterno(alumno.getApellidoPaterno());
			existingAlumno.setEmail(alumno.getEmail());
			return repository.save(existingAlumno);
		}
		return null;
	}
	
	
	
}
