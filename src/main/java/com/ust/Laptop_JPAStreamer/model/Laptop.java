package com.ust.Laptop_JPAStreamer.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Laptop {

	@Id
	@GeneratedValue
	
	@Column(name="Id")
	private Long id;
	
	@Column(name="Brand")
    private String brand;
	
	@Column(name="Model")
    private String model;
	
	@Column(name="Price")
    private double price;

	public String getBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Laptop> getSpecifications() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
