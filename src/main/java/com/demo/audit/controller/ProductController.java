package com.demo.audit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.audit.dto.ProductRequest;
import com.demo.audit.entity.Product;
import com.demo.audit.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public String saveProduct(@RequestBody ProductRequest<Product> request) {
		return productService.saveProduct(request);
	}

	@PutMapping("/updateProduct/{id}/{price}")
	public String updateProduct(@PathVariable Long id, @PathVariable double price,
			@RequestBody ProductRequest<Product> request) {
		return productService.updateProduct(id, price, request);
	}
	
	@GetMapping("/getProduct")
	public String getProduct() throws InterruptedException {
		return productService.getProductService();
	}


}
