package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Order_Product;
import net.javaguides.springboot.repository.Order_ProductRepository;
import net.javaguides.springboot.service.Order_Product_Service;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Order_ProductServiceImpl implements Order_Product_Service {
    private Order_ProductRepository order_productRepository;

    public Order_ProductServiceImpl(Order_ProductRepository order_productRepository) {
        this.order_productRepository = order_productRepository;
    }

    @Override
    public Order_Product saveOrder_Product(Order_Product order_product) {
        return order_productRepository.save(order_product);
    }

    @Override
    public List<Order_Product> getAllOrderProducts_ById(Long id) {
        return order_productRepository.findByOrder_Id(id);
    }



}
