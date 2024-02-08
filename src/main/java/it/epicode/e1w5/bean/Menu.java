package it.epicode.e1w5.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy = "menu")
    private List<PizzaBase> pizze;
    @OneToMany(mappedBy = "menu")
    private List<Topping> toppings;
    @OneToMany(mappedBy = "menu")
    private List<Bevanda> bevande;
public void StampaMenu(){
    pizze.stream().forEach(pizza -> System.out.println("            Pizze                         Calorie               Prezzo \n"
            +pizza.getNome()+"("+pizza.getMozzarella()+","+pizza.getPomodoro()+","+pizza.getToppings()+")"+"       "+pizza.getCalorie()+"                "+pizza.getPrezzo()+ "\n"));
    toppings.stream().forEach(t -> System.out.println(t + "\n"));
    bevande.stream().forEach(b -> System.out.println(b + "\n"));
}
}
