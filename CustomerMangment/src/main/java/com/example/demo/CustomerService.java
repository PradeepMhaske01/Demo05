package com.example.demo;

public class CustomerService {
	
   String savedataIndb(Customer c){
	   if(c.getId()<100) {
		   return c.getName()+ "not allowed to add";
	   }
		
		return c.getName()+ " u r added";
	}

}
