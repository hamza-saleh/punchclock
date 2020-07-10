package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Orders;
import ch.zli.m223.punchclock.service.OrdersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrdersService ordersService;

    public OrderController(OrdersService ordersService){
        this.ordersService = ordersService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Orders> getAllOrders() {
        return ordersService.findAllOrders();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Orders createOrder(@Valid @RequestBody Orders orders) {
        return ordersService.createOrder(orders);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable long id) {ordersService.deleteOrder(id);}

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateOrder(@Valid @RequestBody Orders orders) {ordersService.updateEntry(orders);}
}
