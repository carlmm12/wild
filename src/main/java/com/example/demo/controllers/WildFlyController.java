/**
 * 
 */
package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author carl.mora
 *
 */
@RestController
@RequestMapping("/wildfly")
public class WildFlyController {

	@GetMapping(value="/")
	public String pruebaServer() {
		System.out.println("Esta entrando al metodo");
		return "Hoa esto esta serviendo";
	}
	
	
}
