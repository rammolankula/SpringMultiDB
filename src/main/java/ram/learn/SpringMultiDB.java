package ram.learn;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ram.learn.customerrepo.Customerrepository;
import ram.learn.model.customer.Customer;
import ram.learn.model.product.Product;
import ram.learn.productrepo.Productrepository;

@SpringBootApplication
public class SpringMultiDB implements CommandLineRunner{

	@Autowired
	private Productrepository prodRepo;

	@Autowired
	private Customerrepository customerrepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringMultiDB.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		prodRepo.saveAll(Arrays.asList(
				new Product(1, "Ram", "Ram"), 
				new Product(2, "Ram", "Ram"),
				new Product(3, "Ram", "Ram")));
		
		customerrepo.saveAll(Arrays.asList(
				new Customer(1, "Ganesh", "Ram"),
				new Customer(2, "Ganesh", "Ram"),
				new Customer(3, "Ganesh", "Ram")));
	}
}
