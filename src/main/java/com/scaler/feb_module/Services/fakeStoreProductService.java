package com.scaler.feb_module.Services;

import com.scaler.feb_module.Models.Products;
import com.scaler.feb_module.dto.fakestoreDto;
import com.scaler.feb_module.exceptions.ProductNotFound;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service("fakeStoreProductService")
public class fakeStoreProductService implements productService {


    private RestTemplate restTemplate;
    // we are using rest templetees to convert json format to java objects

    public fakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Products getProductbyId(Long id) throws ProductNotFound {
        System.out.println("getProductbyId @ service: " + id);

        fakestoreDto fkdto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, fakestoreDto.class);

        if(fkdto == null)
        {
            throw new ProductNotFound("Product not found with id: " + id);
        }

        return fkdto.getProducts();
    }

    @Override
    public List<Products> getAllproducts() {
        return List.of();
    }

    @Override
    public Products createProduct(long id, String title, String description, double price,String category) {
        fakestoreDto fkcreatedto = new fakestoreDto();
//        fkcreatedto.setId(id);
        fkcreatedto.setTitle(title);
        fkcreatedto.setDescription(description);
        fkcreatedto.setPrice(price);
        fkcreatedto.setCategory(category);
        System.out.println(fkcreatedto);
        fakestoreDto response = restTemplate.postForObject("https://fakestoreapi.com/products",fkcreatedto, fakestoreDto.class);

        return response.getProducts();
    }


}

