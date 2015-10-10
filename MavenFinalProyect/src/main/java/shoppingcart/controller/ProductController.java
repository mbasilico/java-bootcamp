package shoppingcart.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.Product;
import shoppingcart.service.ProductServiceImp;

@RestController
@RequestMapping("/product")
@EnableAutoConfiguration
public class ProductController {
	
	@Autowired
	ProductServiceImp productServiceImp;	
	
	public ProductController() {
	}
	
	static {
		System.out.println("Inici� ProductController");
	}
	
	// for testing porpose only
	@RequestMapping("/")
    public String index() {
        return "Product Controller - Greetings from Spring Boot!";
    }
	
	@RequestMapping(value="/getProductByID/{productID}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Product getProductByID(@RequestParam Long id){
		try {
			Product product;
			product = productServiceImp.findById(id);
			return product;
		} catch (Exception e) {
			System.out.println("It couldn't get the product. "+ e );			
		}
		return null;
	}
	
	@RequestMapping(value="/getProductByName", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Product getProductByName(@RequestParam String name){
		try {
			Product product;
			product = productServiceImp.findByName(name);
			return product;
		} catch (Exception e) {
			System.out.println("It couldn't get the product. "+ e );
		}
		return null;
	}	
	
	@RequestMapping(value="/getProducts", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts(){
		return productServiceImp.findAll();
	}
	
	@RequestMapping(value="/newProduct", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void newProduct(@RequestParam String name,@RequestParam BigDecimal price,@RequestParam int stock, @RequestParam String descrip, @RequestParam String catalogueType){
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		product.setDescription(descrip);
		product.setCatalogueType(catalogueType);
		productServiceImp.persist(product);
	}	

}
