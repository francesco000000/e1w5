package it.epicode.e1w5.bean;

import lombok.Data;

import java.util.List;

@Data
public   class PizzaBase extends ElementoMenu {
    private String pomodoro= "pomodoro";
    private String mozzarella = "mozzarella";
    private List<Topping> toppings;

    @Override
    public String toString() {
        return "PizzaBase{" +
                "pomodoro=" + pomodoro +
                ", mozzarella=" + mozzarella +
                ", toppings=" + toppings +
                "} " + super.toString();
    }

  


}
