package it.epicode.e1w5.bean;

import lombok.Data;

@Data
public abstract class ElementoMenu {
    private String nome;
    private double prezzo;
    private int calorie;

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie ;
    }
}
