package retosciclo4.reto02.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import retosciclo4.reto02.interfaces.InterfaceOrder;
import retosciclo4.reto02.model.Order;

/**
 *
 * @author desarrolloextremo
 */
@Repository
public class OrderRepository {

    @Autowired
    private InterfaceOrder interfaceOrder;

    public List<Order> getAll() {
        return (List<Order>) interfaceOrder.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return interfaceOrder.findById(id);
    }

    public Order create(Order order) {
        return interfaceOrder.save(order);
    }

    public void update(Order order) {
        interfaceOrder.save(order);
    }

    public void delete(Order order) {
        interfaceOrder.delete(order);
    }
    
    public Optional<Order> lastUserId(){
        return interfaceOrder.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zone) {
        return interfaceOrder.findByZone(zone);
    }
}
