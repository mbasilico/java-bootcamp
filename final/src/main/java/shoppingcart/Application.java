package shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import shoppingcart.DAO.ItemsDAO;

@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	@Autowired
	ItemsDAO items;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
