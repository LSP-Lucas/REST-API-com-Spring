package com.algaworks.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	//Pesquisa por nome exato
	List<Cliente> findByNome(String nome);
	
	//Pesquisa com like
	List<Cliente> findByNomeContaining(String nome);
	
	Cliente findByEmail(String email);
	
}
