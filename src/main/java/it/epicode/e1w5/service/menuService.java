package it.epicode.e1w5.service;

import it.epicode.e1w5.bean.ElementoMenu;
import it.epicode.e1w5.bean.Menu;
import it.epicode.e1w5.repository.menuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class menuService {
    @Autowired
    private menuRepository menuRepository;

    public void salva(Menu menu){
        menuRepository.save(menu);
    }
    public Menu cercaElementoMenu(int id){
        return menuRepository.findById(id).get();
    }
    public void eliminaMenu(int id){
        menuRepository.deleteById(id);
    }
}
