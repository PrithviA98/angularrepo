package com.aciworldwide.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.aciworldwide.entities.Product;


@Repository
public class ProductRepositoryImpl implements ProductRepositories {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Product getById(long id) {
		String sql="select * from product where id=?";
		Object[] args= {id};
		return jdbcTemplate.query(sql, args, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next())
				{
					Product product=new Product(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getFloat(4));
					return product;
				}
				else
					
				return null;
			}
		});
	}

	@Override
	public List<Product> getAll() {
		
		String sql="Select * from product;";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Product> products=new ArrayList<>();
				
				while(rs.next())
				{
					Product product =new Product();
					product.setId(rs.getLong(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);				}
				return products;
			}
			
		});
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		String sql="Insert into product values(?,?,?,?)";
		Object[] args= {product.getId(),product.getName(),product.getBrand(),product.getPrice()};
		int updateCount=jdbcTemplate.update(sql, args);
		
		if( updateCount>0)
		{
			System.out.println("New product is inserted..");
		}
		else
			System.out.println("Sorry.. New product coud not be inserted");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

		String sql="update product set name=?,brand=?,price=? where id=?";
		Object[] args= {product.getName(),product.getBrand(),product.getPrice(),product.getId()};
		int updateCount=jdbcTemplate.update(sql, args);
		
		if( updateCount>0)
		{
			System.out.println("New product is UPDATED..");
		}
		else
			System.out.println("Sorry.. New product coud not be updated");
	

	}

	@Override
	public void delete(Product product) {
		
		String sql="delete from product where id=?;";
		Object[] args= {product.getId()};
		int delCount=jdbcTemplate.update(sql, args);
		
		if( delCount>0)
		{
			System.out.println("New product is Deleted..");
		}
		else
			System.out.println("Sorry.. New product coud not be deleted");
	
	}

	@Override
	public Long count() {
		String sql="select count(*) from product";
		
		return jdbcTemplate.query(sql, new ResultSetExtractor<Long>() {

			@Override
			public Long extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				if(rs.next())
				{
				return rs.getLong(1);
				}
				return null;
			}
		});
				
	}

	@Override
	public List<Product> getByBrand(String brand) {
		String sql="Select * from product where brand=?;";
		Object[] args= {brand};
		return jdbcTemplate.query(sql, args,new ResultSetExtractor<List<Product>>() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Product> products=new ArrayList<>();
				
				while(rs.next())
				{
					Product product =new Product();
					product.setId(rs.getLong(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);	
					}
				return products;
			}
			
		});

	}

	
}
