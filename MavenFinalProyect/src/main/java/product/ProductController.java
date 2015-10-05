package product;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	ProductServiceImp productServiceImp;
	
	@RequestMapping(value="/getProductByID", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Product getProductByID(String id){
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
	public @ResponseBody Product getProductByName(String name){
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
	

}
