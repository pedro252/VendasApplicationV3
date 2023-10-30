package springbootvendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootvendas.domain.entity.Produto;

public interface Produtos  extends JpaRepository<Produto, Integer> {
}
