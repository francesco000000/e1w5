package it.epicode.e1w5.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int numeroTavolo;
    private int MassimonumeroCoperti;
    @OneToOne
    @JoinColumn(name = "ordine_id")
    private Ordine ordine;
    @Enumerated
    private Stato stato;

}
