package shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
//@ImportResource("beansCg.xml")
//@ComponentScan("shopingcart")
public class MainApp {

	public static void main(String[] args) throws Throwable {
		
		ApplicationContext ctx = SpringApplication.run(MainApp.class, args);
		
		System.out.println("Inició la ejecución");		

	}
}
