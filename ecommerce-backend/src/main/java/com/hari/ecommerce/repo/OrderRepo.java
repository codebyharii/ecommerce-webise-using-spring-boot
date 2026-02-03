package com.hari.ecommerce.repo;

import com.hari.ecommerce.model.Orders;
import com.hari.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepo extends JpaRepository<Orders,Long> {
    @Query("SELECT o from Orders o JOIN FETCH o.User")
    List<Orders> findAllOrdersWithUsers();

    List<Orders> findByUser(User user);
}
