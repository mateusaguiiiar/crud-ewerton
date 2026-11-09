package com.example.crud_ewerton.repository;

import com.example.crud_ewerton.model.Usuario; // Alterado de DTO para a Entidade Usuario
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { // Trocado UsuarioDTO por Usuario
}