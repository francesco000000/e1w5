package it.epicode.e1w5.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public  class Bevanda extends ElementoMenu {
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @ManyToOne
    @JoinColumn(name = "ordine_id")
    private Ordine ordine;
    @Override
    public String toString() {
        return "Bevanda{} " + super.toString();
    }
}
