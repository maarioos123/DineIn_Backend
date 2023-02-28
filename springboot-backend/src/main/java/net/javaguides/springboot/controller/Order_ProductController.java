package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Order_Product;
import net.javaguides.springboot.service.Order_Product_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order_products")
public class Order_ProductController {
    private final Order_Product_Service order_product_service;

    public Order_ProductController(Order_Product_Service order_product_service) {
        this.order_product_service = order_product_service;
    }

    @PostMapping
    public ResponseEntity<Order_Product> saveOrder_Product(@RequestBody Order_Product order_product) {
        return new ResponseEntity<>(order_product_service.saveOrder_Product(order_product), HttpStatus.CREATED);
    }


    // build get all orders REST API
    @GetMapping("{Order_id}")
    public List<Order_Product> getAllOrders_Products(@PathVariable("Order_id") long Order_Id) {
        return order_product_service.getAllOrderProducts_ById(Order_Id);
    }

}
