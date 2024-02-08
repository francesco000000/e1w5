package it.epicode.e1w5.service;

import it.epicode.e1w5.bean.ElementoMenu;
import it.epicode.e1w5.repository.elementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class elementoMenuService {
    @Autowired
   private elementoRepository elementoRepository;

    public void salva(ElementoMenu elementoMenu){
        elementoRepository.save(elementoMenu);
    }
    public ElementoMenu cercaElementoMenu(int id){
        return elementoRepository.findById(id).get();
    }
    public void eliminaElementoMenu(int id){
        elementoRepository.deleteById(id);
    }
    public List<ElementoMenu> cercaElementoPerNome(String nome){
        return elementoRepository.findByNome(nome);
    }
}
