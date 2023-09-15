package com.tcc.inf2fm.myproject2fteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.inf2fm.myproject2fteste.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, ID>{

}
