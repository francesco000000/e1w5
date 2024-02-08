package it.epicode.e1w5.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ElementoMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
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
