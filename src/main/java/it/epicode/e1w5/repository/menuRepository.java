package it.epicode.e1w5.repository;

import it.epicode.e1w5.bean.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface menuRepository extends JpaRepository<Menu,Integer > {
}
