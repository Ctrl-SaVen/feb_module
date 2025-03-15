package com.scaler.feb_module.Controllers;

import com.scaler.feb_module.Models.Products;
import com.scaler.feb_module.Services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    private productService pdtService;
//
//
    public ProductController(productService ProductService) {
        this.pdtService = ProductService;
    }

@RequestMapping(value = "/createProduct",method=RequestMethod.POST)
    public Products createProduct(@RequestBody Products products)
{
     Products p = pdtService.createProduct(products.getId(),products.getTitle(),products.getDescription(),products.getPrice(),products.getCategory().getTilte() );
     
      return p;
    }
@GetMapping("getProduct/{id}")
    public Products getProductById(@PathVariable("id") long id)
{
//        System.out.println("getProductById controller"+id);\

      Products p=  pdtService.getProductbyId(id);

    return p;
    }

    public void deleteProductById(long id)
    {

    }

    public void updateProductById(Products product)
    {

    }








}
