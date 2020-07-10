package ch.zli.m223.punchclock.service;
import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Orders;
import ch.zli.m223.punchclock.repository.EntryRepository;
import ch.zli.m223.punchclock.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    private OrdersRepository ordersRepository;

    public OrdersService (OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public Orders createOrder(Orders orders) {
        return ordersRepository.saveAndFlush(orders);
    }
    public List <Orders> findAllOrders(){
        return ordersRepository.findAll();
    }
    public void deleteOrder(long id) {
        ordersRepository.deleteById(id);
    }
    public void updateEntry (Orders orders){
        ordersRepository.save(orders);
    }
}
