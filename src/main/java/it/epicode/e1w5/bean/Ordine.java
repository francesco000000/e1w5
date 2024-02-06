package it.epicode.e1w5.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
@Data
public class Ordine {
    private List<PizzaBase> pizze;
    private List<Bevanda> bevande;
    private int numeroOrdine;
    private Stato stato;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private double costoCoperto;

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
