package com.shopping.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.shopping.cart.main.Product;
import com.shopping.cart.service.ProductService;


@RestController
@RequestMapping ("/product")
public class ProductController {
	@Autowired
    private ProductService pService;
	
	@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
	public List<Product> getProducts(){
		return pService.getProductList();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST,headers="Accept=application/json", produces={"application/json"})
	public @ResponseBody Product addProduct(@RequestBody Product product){
		pService.addProduct(product);
		return product;
	}

	@RequestMapping(value="/delete/{productId}")
	@ResponseBody
	public String deleteProduct(@PathVariable Integer productId) {

		pService.deleteProduct(productId);
		return "Product deleted";
	}

	@RequestMapping(value = "/search/{name}", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Product> searchName(@PathVariable String name) {
		return pService.searchName(name);		
	}
	
}
