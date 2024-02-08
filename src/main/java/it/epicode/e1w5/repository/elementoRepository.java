package it.epicode.e1w5.repository;

import it.epicode.e1w5.bean.ElementoMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface elementoRepository extends JpaRepository<ElementoMenu,Integer> {
    public List<ElementoMenu> findByNome(String nome);
}
