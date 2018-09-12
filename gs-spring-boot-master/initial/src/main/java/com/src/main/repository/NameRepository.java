package com.src.main.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Repository;

import com.src.main.model.Name;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {

	List<Name> findAllNames();

	Name save(@Valid Name name);

	Name findById(Long nameId);

	

}