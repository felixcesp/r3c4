/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Reto3.Repository;

import Reto3.Reto3.mongoRepository.OrderMongoRepository;
import Reto3.Reto3model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author johan
 */
@Repository
public class OrderRepository {

    @Autowired
    private OrderMongoRepository orderRepo;

    public List<Order> getAll() {
        return (List<Order>) orderRepo.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderRepo.findById(id);
    }

    public Order create(Order order) {
        return orderRepo.save(order);
    }

    public void update(Order order) {
        orderRepo.save(order);
    }

    public void delete(Order order) {
        orderRepo.delete(order);
    }
    
    public Optional<Order> lastUserId(){
        return orderRepo.findTopByOrderByIdDesc();
    }
    
    public List<Order> findByZone(String zona) {
        return orderRepo.findByZone(zona);
    }
}
