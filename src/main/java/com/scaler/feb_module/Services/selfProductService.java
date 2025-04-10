package com.scaler.feb_module.Services;

import com.scaler.feb_module.Models.Category;
import com.scaler.feb_module.Models.Products;
import com.scaler.feb_module.Repositories.catagoryRepository;
import com.scaler.feb_module.Repositories.productRepository;
import com.scaler.feb_module.exceptions.ProductNotFound;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class selfProductService implements productService{

    private productRepository productRepository;
    private catagoryRepository categoriesRepository;

    public selfProductService(com.scaler.feb_module.Repositories.productRepository productRepository, catagoryRepository categoriesRepository) {
        this.productRepository = productRepository;
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public Products getProductbyId(Long id) throws ProductNotFound {
         Optional<Products> p = productRepository.findById(id);



        if (p.isPresent()) {

              return p.get();

          }
          throw new ProductNotFound("Product not found"+id);




    }

    @Override
    public List<Products> getAllproducts() {
        return List.of();
    }

    @Override
    public Products createProduct(long id, String title, String description, double price, String categorytitle) {


      Products pd = new Products();
//      Category cat = catagoryRepository.findByTitle(categorytitle);
        System.out.println(categorytitle);
      Category category = categoriesRepository.findByTitle(categorytitle);
        System.out.println(category);
      if(category == null) {
          Category cat = new Category();
          cat.setTitle(categorytitle);
          Category newRow = categoriesRepository.save(cat);
          pd.setCategory(newRow);
      }
      else
      { pd.setCategory(category);}

      pd.setId(id);
      pd.setTitle(title);
      pd.setDescription(description);
      pd.setPrice(price);

      Products savedProduct = productRepository.save(pd);
        System.out.println(savedProduct);
        return savedProduct;
    }
}
