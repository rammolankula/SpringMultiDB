package ram.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ram.learn.customerrepo.Customerrepository;
import ram.learn.model.customer.Customer;
import ram.learn.model.product.Product;
import ram.learn.productrepo.Productrepository;

@RestController
public class MultiDBController {
	
	
	@Autowired
	Productrepository prodrepo;
	
	@Autowired
	Customerrepository custrepo;
	
	
	@GetMapping("/getAllProducts")
	private List<Product> getAllproducts(){
		return prodrepo.findAll();
	}

	@GetMapping("/getAllCustomers")
	private List<Customer> getAllCustomer(){
		return custrepo.findAll();
		
	}
}
