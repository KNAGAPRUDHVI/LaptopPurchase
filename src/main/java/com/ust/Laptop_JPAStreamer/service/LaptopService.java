package com.ust.Laptop_JPAStreamer.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.speedment.jpastreamer.application.JPAStreamer;
import com.ust.Laptop_JPAStreamer.model.Laptop;
import com.ust.Laptop_JPAStreamer.repository.LaptopRepository;

import jakarta.transaction.Transactional;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository laptoprepository;
	
	private JPAStreamer jpaStreamer;

    public List<Laptop> getLaptops(String brand, String specifications, double maxPrice) {
        return jpaStreamer.stream(Laptop.class)
                          .filter(laptop -> (brand.map(laptop.getBrand().equalsIgnoreCase(brand))) &&
                                            (specifications.map(laptop.getSpecifications().contains(specifications)) &&
                                            laptop.getPrice() <= maxPrice))
                          .collect(Collectors.toList());
        
    }
    
    public List<Laptop> getLaptops() {
        return laptoprepository.findAll();
    }
}
