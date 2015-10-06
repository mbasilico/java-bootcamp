package shoppingcart;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import shoppingcart.controller.ProductController;

@SpringBootApplication
//@ImportResource("beansCg.xml")
//@ComponentScan("shopingcart")
public class MainApp {

	public static void main(String[] args) throws Throwable {
		
		ApplicationContext ctx = SpringApplication.run(MainApp.class, args);

		System.out.println("inició la ejecucion");
		
//		String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
//		ProductController pc = new ProductController();
//
//		pc.newProduct("cellphone", new BigDecimal(200), 10, "great cellphone", "normal");

	}
}
