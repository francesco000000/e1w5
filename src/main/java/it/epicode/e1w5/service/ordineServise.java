package it.epicode.e1w5.service;

import it.epicode.e1w5.bean.ElementoMenu;
import it.epicode.e1w5.bean.Ordine;
import it.epicode.e1w5.repository.ordineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ordineServise {
    @Autowired
    private ordineRepository ordineRepository;

    public void salva(Ordine ordine){
        ordineRepository.save(ordine);
    }
    public Ordine cercaOrdine(int id){
        return ordineRepository.findById(id).get();
    }
    public void eliminaOrdine(int id){
        ordineRepository.deleteById(id);
    }
}
