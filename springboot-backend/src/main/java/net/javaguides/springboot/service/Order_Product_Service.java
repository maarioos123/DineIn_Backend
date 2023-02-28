package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Order_Product;

import java.util.List;
import java.util.Optional;
public interface Order_Product_Service {

    Order_Product saveOrder_Product(Order_Product order_product);
    List<Order_Product> getAllOrderProducts_ById(Long id);

}
