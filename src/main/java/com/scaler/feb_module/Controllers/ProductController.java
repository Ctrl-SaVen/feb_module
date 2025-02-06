package com.scaler.feb_module.Controllers;

import com.scaler.feb_module.Models.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


@RequestMapping(value = "/createProduct",method=RequestMethod.POST)
    public void createProduct(Products products){

    }

    public Products getProductById(long id){
    return null;
    }

    public void deleteProductById(long id){

    }

    public void updateProductById(Products product){

    }








}
