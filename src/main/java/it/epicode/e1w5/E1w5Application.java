package it.epicode.e1w5;

import it.epicode.e1w5.bean.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class E1w5Application {

	public static void main(String[] args) {

		SpringApplication.run(E1w5Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Menu menu = ctx.getBean("menu", Menu.class);
		menu.StampaMenu();

	}

}
