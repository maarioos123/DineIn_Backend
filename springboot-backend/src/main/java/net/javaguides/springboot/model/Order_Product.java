package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_product")
@IdClass(Order_Product_Id.class)
public class Order_Product {
    @Id
    @ManyToOne
    @JoinColumn(name = "Order_Id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "Comment")
    private String Comment;
    @Column(name = "Quantity")
    private String Quantity;
}
