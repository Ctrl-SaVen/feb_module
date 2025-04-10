package com.scaler.feb_module.Repositories;

import com.scaler.feb_module.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Products ,Long>
        {


Products findByDescription(String description);

//Products findById(Long id);

//Products save(Products products);

Products findByTitle(String title);


}
