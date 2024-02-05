package it.epicode.e1w5.bean;

import lombok.Data;

import java.util.List;
@Data
public class Menu {
    private List<PizzaBase> pizze;
    private List<Topping> toppings;
    private List<Bevanda> bevande;
public void StampaMenu(){
    pizze.stream().forEach(pizza -> System.out.println("            Pizze                         Calorie               Prezzo \n"
            +pizza.getNome()+"("+pizza.getMozzarella()+","+pizza.getPomodoro()+","+pizza.getToppings()+")"+"       "+pizza.getCalorie()+"                "+pizza.getPrezzo()+ "\n"));
    toppings.stream().forEach(t -> System.out.println(t + "\n"));
    bevande.stream().forEach(b -> System.out.println(b + "\n"));
}
}
