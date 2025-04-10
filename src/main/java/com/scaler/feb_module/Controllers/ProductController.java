package com.scaler.feb_module.Controllers;

import com.scaler.feb_module.Models.Products;
import com.scaler.feb_module.Services.productService;
import com.scaler.feb_module.dto.ErrorDto;
import com.scaler.feb_module.exceptions.ProductNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    private productService pdtService;
//
//
    public ProductController(@Qualifier("selfProductService") productService ProductService) {
        this.pdtService = ProductService;
    }

@RequestMapping(value = "/createProduct",method=RequestMethod.POST)
    public Products createProduct(@RequestBody Products products)
{
    System.out.println(products.getCategory().getTitle());
     Products p = pdtService.createProduct(products.getId(),products.getTitle(),products.getDescription(),products.getPrice(),products.getCategory().getTitle() );
     
      return p;
    }
@GetMapping("getProduct/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable("id") long id) throws ProductNotFound
{
//        System.out.println("getProductById controller"+id);\

//      Products p=  pdtService.getProductbyId(id);
//
//      ResponseEntity<Products> response = new ResponseEntity<>(p, HttpStatus.OK);

    return null; // response;
    }

    public void deleteProductById(long id)
    {

    }

    public void updateProductById(Products product)
    {

    }

    @ExceptionHandler(ProductNotFound.class)
    public ResponseEntity<ErrorDto> handleProductNotFoundException(Exception e)
    {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setMessage(e.getMessage());

        ResponseEntity<ErrorDto> response1 = new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
        return response1;
    }















}
