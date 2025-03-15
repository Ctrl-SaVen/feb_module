package com.scaler.feb_module.Services;

import com.scaler.feb_module.Models.Products;
import com.scaler.feb_module.dto.fakestoreDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
public class fakeStoreProductService implements productService {


    private RestTemplate restTemplate;

    public fakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Products getProductbyId(Long id) {
        System.out.println("getProductbyId @ service: " + id);

        fakestoreDto fkdto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, fakestoreDto.class);
        return fkdto.getProducts();
    }

    @Override
    public List<Products> getAllproducts() {
        return List.of();
    }

    @Override
    public Products createProduct(long id, String title, String description, double price,String category) {
        fakestoreDto fkcreatedto = new fakestoreDto();
        fkcreatedto.setId(id);
        fkcreatedto.setTitle(title);
        fkcreatedto.setDescription(description);
        fkcreatedto.setPrice(price);
        fkcreatedto.setCategory(category);

        fakestoreDto response = restTemplate.postForObject("https://fakestoreapi.com/products",fkcreatedto, fakestoreDto.class);

        return response.getProducts();
    }


}

