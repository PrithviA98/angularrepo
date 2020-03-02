package com.aciworldwide.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aciworldwide.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query("select * from product where name=:nm")
	List<Product> findByName(@Param("nm")String name);

	@Query("select * from product where brand=:br")
	List<Product> findByBrand(@Param("br")String branch);
	
	
	@Query("select * from product where price between :min and :max")
	List<Product> findByPrice(@Param("min")Float min,@Param("max")Float max);
	
	@Modifying
	@Query("insert into product values(:id,:nm,:br,:pr)")
	int insert(@Param("id")Long id,@Param("nm")String name,@Param("br")String bran,@Param("pr")Float price);

	@Query("select * from product order by name")
	List<Product> sortName();
	
	@Query("select * from product order by id")
	List<Product> sortId();
	
	@Query("select * from product order by brand")
	List<Product> sortBrand();
}
