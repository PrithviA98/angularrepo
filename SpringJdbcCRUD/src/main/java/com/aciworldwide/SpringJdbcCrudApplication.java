package com.aciworldwide;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aciworldwide.entities.Product;
import com.aciworldwide.repositories.ProductRepository;

@SpringBootApplication
public class SpringJdbcCrudApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository pr;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcCrudApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******MENU******");
		System.out.println("all:Search all products");
		System.out.println("id:Search by id products");
		System.out.println("insert:To add a new element");
		System.out.println("update:To update a element");
		System.out.println("delete:To delete a element");
		System.out.println("count:To acount elements");
		System.out.println("allbyname:Search by name products");
		System.out.println("allbybranch:Search by branch products");
		System.out.println("range:within a range");
		System.out.println("namesort: Sort by product name");
		System.out.println("idsort: Sort by product id");
		System.out.println("brandsort: Sort by product brand");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n");
		String choice=sc.next();
		
		
		switch(choice)
		{
		case "all":
		{
			Iterable<Product> products=pr.findAll();
			products.forEach(product->System.out.println(product));
			break;
		}
		case "id":
				{
					System.out.println("Enter id to Search by id products");
					long id=sc.nextLong();
					Optional<Product> optionalProduct=pr.findById(id);
					
					if(optionalProduct.isPresent())
					{
						Product p=optionalProduct.get();
						System.out.println(p);
					}
					else
					{
						System.out.println("SORRY!!! PRODUCT NOT FOUND");
					}	
				}
		case "insert":
			{
				//INSERT
				System.out.println("Enter new product id:");
				long newid=sc.nextLong();
				
				System.out.println("Enter new product name:");
				sc.nextLine();
				String newname=sc.nextLine();
				
				System.out.println("Enter new product brand:");
				String newbrand=sc.nextLine();
				
				System.out.println("Enter new product price:");
				float newprice=sc.nextFloat();
				
				int updateCount=pr.insert(newid, newname, newbrand, newprice);
				
				if(updateCount>0)
				{
					System.out.println("Saved...");
				}
				else
				{
					System.out.println("Not saved");
				}
				
				break;
			}
			
		case"update":
		{//UPDATE
			System.out.println("Enter existing product id to be updated:");
			long exsid=sc.nextLong();
			Optional<Product> optionalProductEx=pr.findById(exsid);
			
			if(optionalProductEx.isPresent())
			{
				Product pEx=optionalProductEx.get();
				System.out.println(pEx);
				
				System.out.println("Enter updated product name:");
				sc.nextLine();
				String newname=sc.nextLine();
				pEx.setName(newname);
				
				System.out.println("Enter updated product brand:");
				String newbrand=sc.nextLine();
				pEx.setBrand(newbrand);
				
				System.out.println("Enter updated product price:");
				Float newprice=sc.nextFloat();
				pEx.setPrice(newprice);
				
				pr.save(pEx);
				System.out.println("updated");
			}
			else
			{
				System.out.println("SORRY!!! PRODUCT NOT FOUND");
			}	
				
		}	
		case "delete":
			System.out.println("Enter existing product id to be updated:");
			long exsid=sc.nextLong();
			Optional<Product> optionalProductEx=pr.findById(exsid);
			
			if(optionalProductEx.isPresent())
			{
				Product pEx=optionalProductEx.get();
				System.out.println(pEx);
				pr.delete(pEx);
				System.out.println("updated");
			}
			
		case"count":
			System.out.println("No. of products:"+pr.count());
			break;
			
			
		case "allbyname":
			System.out.println("Enter the product name");
			sc.nextLine();
			 String name=sc.nextLine();
			 List<Product>products=pr.findByName(name);
			 products.forEach(System.out::println);
			break;
			
			
		case "allbybranch":
			System.out.println("Enter the product branch");
			sc.nextLine();
			 String branch=sc.nextLine();
			 products=pr.findByBrand(branch);
			 products.forEach(System.out::println);
			break;
			
		case "range":
			System.out.println("Enter the range values:");
			System.out.println("Enter the min range value:");
			Float min=sc.nextFloat();
			
			System.out.println("Enter the max range value:");
			Float max=sc.nextFloat();
			
			 products=pr.findByPrice(min,max);
			 products.forEach(System.out::println);
			
			break;
			
		case "namesort":
			products=pr.sortName();
			products.forEach(System.out::println);
			break;
			
		case "idsort":
			products=pr.sortId();
			products.forEach(System.out::println);
			break;
			
		case "brandsort":
			products=pr.sortBrand();
			products.forEach(System.out::println);
			
			
		default:
			break;
		}
		
		sc.close();
	}

}
