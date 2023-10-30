package springbootvendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootvendas.domain.entity.ItemPedido;

public interface ItensPedidos extends JpaRepository<ItemPedido, Integer> {
}
