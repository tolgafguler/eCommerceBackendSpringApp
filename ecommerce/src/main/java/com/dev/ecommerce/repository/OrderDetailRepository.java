package com.dev.ecommerce.repository;

import com.dev.ecommerce.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository <OrderDetail,Long> {
    List<OrderDetail> findByOrdersId(Long ordersId);
}
