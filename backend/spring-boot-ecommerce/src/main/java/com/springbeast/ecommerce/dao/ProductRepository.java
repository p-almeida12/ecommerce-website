package com.springbeast.ecommerce.dao;

import com.springbeast.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository  extends JpaRepository<Product, Long> {

    //query method tht find by the category id, no coding needed!
    //in this method spring just queries SELECT * FROM product WHERE category_id = ? with pagination!!
    //spring also exposes automatically the end point based on the method name "../search/findByCategoryId?id=?"
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    //spring builds the query based on the name of the method
    //the query made is just select * from product p where p.name like concat('%', name, '%')
    Page<Product> findByNameContaining(@Param("name") String name, Pageable page);
}
