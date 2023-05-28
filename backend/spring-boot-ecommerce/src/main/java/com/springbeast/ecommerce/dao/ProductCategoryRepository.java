package com.springbeast.ecommerce.dao;

import com.springbeast.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//productCategory is the name of the JSON entry and the path is the reference
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
@CrossOrigin("http://localhost:4200") //allow to get the data to the backend
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
