package com.scaler.feb_module.Repositories;

import com.scaler.feb_module.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface catagoryRepository extends JpaRepository<Category, Long> {

Category findByTitle(String title);
//Category save(Category category);

}
