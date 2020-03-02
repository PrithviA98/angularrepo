package com.aciworldwide;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aciworldwide.entities.Product;
import com.aciworldwide.repositories.ProductRepositories;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{
@Autowired
	private ApplicationContext ctx;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ProductRepositories pr=ctx.getBean("productRepositoryImpl",ProductRepositories.class);
		System.out.println("Select the opotions:\n 1.INSERT\n 2.DELETE\n 3.UPDATE\n 4.DISPAY\n 5.COUNT\n 6.GET BRAND\n");
		
		List<Product> products=pr.getAll();
		products.forEach(product-> System.out.println(product));
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
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
					Product nproduct=new Product(newid,newname,newbrand,newprice);
					pr.insert(nproduct);	
					break;
				}
		case 2:
				{
					//DELETE
					
					System.out.println("Enter product id to be deleted:");
					long delid=sc.nextLong();
					Product delproduct=pr.getById(delid);
					pr.delete(delproduct);
					break;
					}
		case 3:
					{
						//UPDATE
						System.out.println("Enter product id to be updated:");
						long upid=sc.nextLong();
						
							System.out.println("Enter updated product name:");
							sc.nextLine();
							String upname=sc.nextLine();
							
							System.out.println("Enter updated product brand:");
							String upbrand=sc.nextLine();
							
							System.out.println("Enter updated product price:");
							float upprice=sc.nextFloat();
							Product upproduct=new Product(upid,upname,upbrand,upprice);
							pr.update(upproduct);
							break;
					}
		case 4:
			{
				//SEARCH ELEMENT
				System.out.println("Enter product id: ");
				long id=sc.nextLong();
				
				Product product=pr.getById(id);
				
				if(product !=null)
				{
					System.out.println(product);
				}
				else
					System.out.println("Sorry ! Product not found");
			
				break;
				}
		case 5:
				{
					long count=pr.count();
					System.out.println("Count of the records.."+count);
					break;
				}
		case 6:
				{
					System.out.println("Enter the brand name:");
					String brandName=sc.next();
					List<Product> pp=pr.getByBrand(brandName);
					System.out.println(pp);
					break;
					
					
				}
		
		}
		sc.close();
	}

}
