package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@PostMapping("addcustomer")
	String addCustomer(@RequestBody Customer c){
		CustomerService cs = new CustomerService();
		return cs.savedataIndb(c);
		
	}

}
