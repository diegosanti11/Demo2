package com.ait.mx.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.mx.dto.MyResponseDTO;


@RestController
public class Controller {
	
	@GetMapping("/saluda")
	public ResponseEntity<MyResponseDTO> getSaludo(){
		return new ResponseEntity<>(new MyResponseDTO("SALUDOS","OK"),HttpStatus.OK);
	}

}
