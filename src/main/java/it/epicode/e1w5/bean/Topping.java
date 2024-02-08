package it.epicode.e1w5.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

@Data
@Entity
public   class Topping extends ElementoMenu {
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private PizzaBase pizza;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @Override
    public String toString() {
        return   super.toString();
    }
}
