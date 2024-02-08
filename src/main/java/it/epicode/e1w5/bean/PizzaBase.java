package it.epicode.e1w5.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public   class PizzaBase extends ElementoMenu {
    private String pomodoro= "pomodoro";
    private String mozzarella = "mozzarella";
    @OneToMany(mappedBy = "pizza",cascade = CascadeType.REMOVE)
    private List<Topping> toppings;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @ManyToOne
    @JoinColumn(name = "ordine_id")
    private Ordine ordine;

    @Override
    public String toString() {
        return

                 super.toString();
    }

  


}
