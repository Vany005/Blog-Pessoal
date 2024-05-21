package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//JpaRepository = classe JPA 
public interface PostagemRepository  extends JpaRepository<Postagem, Long> {

	
	
	
}
