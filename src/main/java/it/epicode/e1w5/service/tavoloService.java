package it.epicode.e1w5.service;

import it.epicode.e1w5.bean.ElementoMenu;
import it.epicode.e1w5.bean.Tavolo;
import it.epicode.e1w5.repository.tavoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tavoloService {
    @Autowired
    private tavoloRepository tavoloRepository;

    public void salva(Tavolo tavolo){
       tavoloRepository.save(tavolo);
    }
    public Tavolo cercaTavolo(int id){
        return tavoloRepository.findById(id).get();
    }
    public void eliminaTavolo(int id){
        tavoloRepository.deleteById(id);
    }
}
