package it.epicode.e1w5.bean;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;


@Data
@Entity
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy = "ordine",cascade = CascadeType.REMOVE)
    private List<PizzaBase> pizze;
    @OneToMany(mappedBy = "ordine",cascade = CascadeType.REMOVE)
    private List<Bevanda> bevande;
    private int numeroOrdine;
    @Enumerated(EnumType.STRING)
    private Stato stato;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private double costoCoperto;
    @OneToOne(mappedBy = "ordine",cascade = CascadeType.REMOVE)
    private Tavolo numeroTavolo;
    private double importoTotale;

    public double getImportoTotale() {
        return importoTotale= (numeroCoperti*costoCoperto)+
                pizze.stream().mapToDouble(PizzaBase::getPrezzo).sum()+
                bevande.stream().mapToDouble(Bevanda::getPrezzo).sum();
    }
@Autowired
    public void setNumeroTavolo(Tavolo numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }
}
