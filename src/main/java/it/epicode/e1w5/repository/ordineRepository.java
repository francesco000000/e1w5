package it.epicode.e1w5.repository;

import it.epicode.e1w5.bean.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ordineRepository extends JpaRepository<Ordine,Integer> {
}
