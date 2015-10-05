package shopingcart;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import controller.ProductController;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) throws Throwable {
		
		SpringApplication.run(MainApp.class, args);

		ProductController pc = new ProductController();

		pc.newProduct("cellphone", new BigDecimal(200), 10, "great cellphone", "normal");

	}
}
