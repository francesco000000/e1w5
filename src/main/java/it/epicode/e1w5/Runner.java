package it.epicode.e1w5;

import it.epicode.e1w5.bean.Menu;
import it.epicode.e1w5.bean.Ordine;
import it.epicode.e1w5.bean.PizzaBase;
import it.epicode.e1w5.bean.Tavolo;
import it.epicode.e1w5.service.elementoMenuService;
import it.epicode.e1w5.service.menuService;
import it.epicode.e1w5.service.ordineServise;
import it.epicode.e1w5.service.tavoloService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@Order(1)
public class Runner implements CommandLineRunner {
    @Autowired
private elementoMenuService elementoMenuService;
    @Autowired
private menuService  menuService;
    @Autowired
private ordineServise ordineServise;
    @Autowired
private tavoloService tavoloService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(E1w5Application.class);

     PizzaBase margherita = ctx.getBean("Margherita", PizzaBase.class);
     elementoMenuService.salva(margherita);
     Tavolo tavolo1 = ctx.getBean("tavolo1", Tavolo.class);

       tavoloService.salva(tavolo1);
     Ordine ordine1 = ctx.getBean("ordine1", Ordine.class);
     ordine1.setNumeroTavolo(tavolo1);

     ordineServise.salva(ordine1);
     elementoMenuService.cercaElementoPerNome("Margherita").stream().forEach(e-> System.out.println(e.toString()));
     elementoMenuService.eliminaElementoMenu(1);
     Menu menu = ctx.getBean("menu", Menu.class);

        menuService.salva(menu);

        menu.setPizze(List.of(margherita));

        menuService.salva(menu);
        margherita.setMenu(menu);
        elementoMenuService.salva(margherita);

    }

}
