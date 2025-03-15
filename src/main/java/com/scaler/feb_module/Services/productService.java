package com.scaler.feb_module.Services;

import com.scaler.feb_module.Models.Products;

import java.util.List;

public interface productService {

    Products getProductbyId(Long id);
    List<Products> getAllproducts();
 Products createProduct(long id, String title, String description,double price, String category );



}
