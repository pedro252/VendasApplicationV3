package springbootvendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootvendas.domain.entity.Cliente;
import springbootvendas.domain.entity.Pedido;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
}
