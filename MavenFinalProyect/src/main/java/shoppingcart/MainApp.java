package shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@PropertySource("classpath:application.properties")
public class MainApp {

	public static void main(String[] args) throws Throwable {
		
		/*ApplicationContext ctx = */SpringApplication.run(MainApp.class, args);
		
		System.out.println("Inici� la ejecuci�n");		

	}
}
