package it.epicode.e1w5;

import it.epicode.e1w5.bean.Menu;
import it.epicode.e1w5.bean.Ordine;
import it.epicode.e1w5.bean.PizzaBase;
import it.epicode.e1w5.bean.Tavolo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collector;

@SpringBootTest
class E1w5ApplicationTests {
	 static AnnotationConfigApplicationContext ctx;
	@BeforeAll
    static void recuperoCtx(){
		ctx = new AnnotationConfigApplicationContext(E1w5Application.class);

	}

	@Test
	void verificaPizzeInOrdine() {
		Ordine ordine1 = ctx.getBean("ordine1", Ordine.class);
		Assertions.assertNotEquals(0,ordine1.getPizze().size());
	}
	@Test
	void verificaNumeroCoperti() {
		Ordine o = ctx.getBean("ordine1", Ordine.class);
		Assertions.assertTrue(o.getNumeroCoperti()<=o.getNumeroTavolo().getMassimonumeroCoperti());

	}
	@Test
	void verificaSeEunaPizza(){
		PizzaBase d = ctx.getBean("Diavola", PizzaBase.class);
		PizzaBase m = ctx.getBean("Margherita", PizzaBase.class);
		Assertions.assertNotSame(d,m);

	}
	@ParameterizedTest
	@CsvSource({"Margherita,2","Diavola,1"})
	void verificaPizzeinOrdine(String nome,int risultato){
		Ordine o = ctx.getBean("ordine1", Ordine.class);
		List<PizzaBase> listp = o.getPizze();
		long p =  listp.stream().filter(pizza->pizza.getNome().equals(nome)).count();
		Assertions.assertEquals(p,risultato);

	}

}
