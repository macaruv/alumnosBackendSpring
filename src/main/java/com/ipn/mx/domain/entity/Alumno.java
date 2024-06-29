package com.ipn.mx.domain.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Alumno")
public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAlumno", nullable = false)
    private Long IdAlumno;

    @Column(name="Nombre", length=30, nullable = false)
    private String Nombre;

    @Column(name="ApellidoMaterno", length=30, nullable = false)
    private String ApellidoMaterno;
    
    @Column(name="ApellidoPaterno", length=30, nullable = false)
    private String ApellidoPaterno;
    
    @Column(name="Email", length=50, nullable = false)
    private String Email;
}
