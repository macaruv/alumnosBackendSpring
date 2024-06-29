package com.ipn.mx.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ipn.mx.domain.entity.Alumno;
import com.ipn.mx.service.AlumnoService;

//@CrossOrigin(origins = {"https://categoriayproducto-angular.netlify.app"}, allowCredentials = "true")
@CrossOrigin(origins = {"https://alumnoangularprimeng.netlify.app"}, allowCredentials = "true")

@RestController
@RequestMapping("/api")
public class AlumnoController {
	@Autowired
	AlumnoService service;
	
	@PostMapping("/alumnos")
	public Alumno create(@RequestBody Alumno alumno) {
		System.out.print("Datos recibidos:" + alumno);
		return service.save(alumno);
	}
	
	@DeleteMapping("/alumnos/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
	
	@GetMapping("/alumnos")
	public List<Alumno> showAlumnos(){
		return service.findAll();
	}
	
	@GetMapping("/alumnos/{id}")
    public Alumno findOne(@PathVariable Long id) {
        return service.findById(id);
    }
	
	@PutMapping("/alumnos/{id}")
    public Alumno updateAlumnos(@PathVariable Long id, @RequestBody Alumno alumno) {
        return service.update(id, alumno);
    }
	
}
