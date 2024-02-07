package it.epicode.e1w5;

import it.epicode.e1w5.bean.Menu;
import it.epicode.e1w5.bean.Ordine;
import it.epicode.e1w5.bean.PizzaBase;
import it.epicode.e1w5.bean.Tavolo;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@Order(1)
public class Runner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(E1w5Application.class);

    }
}
