package com.ust.Laptop_JPAStreamer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ust.Laptop_JPAStreamer.model.Laptop;
import com.ust.Laptop_JPAStreamer.service.LaptopService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/laptops")
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/Preference")
	public List<Laptop> getLaptops(@RequestParam String brand,
                                   @RequestParam String specifications,
                                   @RequestParam Double maxPrice) {
		return laptopService.getLaptops(brand, specifications, maxPrice);
	}
	
	@GetMapping("Recommoneded")
	public List<Laptop> getLaptops() {
        return laptopService.getLaptops();
    }
	
}
