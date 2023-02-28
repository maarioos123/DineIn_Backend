package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "Product_Id")
    private long Product_Id;
    @Column(name = "Product_Name")
    private String Product_Name;
    @Column(name = "Category")
    private String Category;
    @Column(name = "Price")
    private float Price;
    @Column(name = "Image")
    private String Image;
    @Column(name = "Description")
    private String Description;
    @Column(name = "Restaurant_Id")
    private long Restaurant_Id;
}
