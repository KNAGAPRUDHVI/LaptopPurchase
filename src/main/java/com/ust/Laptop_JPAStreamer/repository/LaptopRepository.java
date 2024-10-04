package com.ust.Laptop_JPAStreamer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ust.Laptop_JPAStreamer.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
