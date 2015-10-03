package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("main.java.user")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	// @Bean configurations go here...

}
