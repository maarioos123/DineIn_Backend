package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Order_Product;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Order_ProductRepository extends JpaRepository<Order_Product,Long> {
    List<Order_Product> findByOrder_Id(Long id);
}
