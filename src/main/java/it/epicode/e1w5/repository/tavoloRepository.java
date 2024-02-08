package it.epicode.e1w5.repository;

import it.epicode.e1w5.bean.Tavolo;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tavoloRepository extends JpaRepository<Tavolo,Integer> {
}
