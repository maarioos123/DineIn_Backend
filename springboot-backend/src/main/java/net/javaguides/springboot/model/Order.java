package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="cust_order")

public class Order {
        @Id
        @Column(name = "Order_Id")
        private long id;
        @Column(name = "Order_sum")
        private float sum;
        @Column(name = "Table_Νο")
        private int table;
        @Column(name = "Order_Datetime")
        private String datetime;
        @Column(name = "Payment_method")
        private String payment_method;
        @Column(name="Customer_Id")
        private int cust_id;
        @Column(name = "Restaurant_Id")
        private int rest_id;
}
