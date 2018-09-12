package com.src.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.main.model.Name;
import com.src.main.repository.NameRepository;

@RestController
@RequestMapping("/api")
public class NameController {
	
	@Autowired
	NameRepository nameRepository;
	
	// Get All Notes
	@GetMapping("/notes")
	public List<Name> getAllNames(){
		return nameRepository.findAllNames();
	}

	// Create a new Note
	@PostMapping("/notes")
	public Name createName(@Valid @RequestBody Name name) {
		return nameRepository.save(name);
	}

	// Get a Single Note
	@GetMapping("notes/{id}")
	public Name getNameById(@PathVariable(value = "id") Long nameId) {
		return nameRepository.findById(nameId);
	}
	
	// Update a Note
	@PutMapping("/notes/{id}")
	public Name updateName(@PathVariable(value = "id") Long nameId, @Valid @RequestBody Name nameDetails) {
		Name name = nameRepository.findById(nameId);
		name.setTitle(nameDetails.getTitle());
		name.setContent(nameDetails.getContent());
		
		Name updateName = nameRepository.save(name);
		return updateName;
		
	}
	
}
